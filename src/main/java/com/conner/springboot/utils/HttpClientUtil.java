package com.conner.springboot.utils;

import net.minidev.json.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author evan_qb
 * @date 2018/8/13 14:54
 * HttpClient工具
 */
public class HttpClientUtil {
    /**
     * POST请求
     * @param url
     * @param jsonStr
     * @return
     */
    public static String sendpostJson(String url, String jsonStr){
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        CloseableHttpResponse response = null;
        try {
            post.setEntity(new ByteArrayEntity(jsonStr.getBytes("UTF-8")));
            response = httpClient.execute(post);
            if (response != null && response.getStatusLine().getStatusCode() == 200){
                HttpEntity entity = (HttpEntity) response.getEntity();
            }
        }catch (Exception e){

        }finally {
            try {
                httpClient.close();
                if (response != null){
                    response.close();
                }
            } catch (IOException e) {

            }
        }
        return null;
    }

    /**
     * GET请求
     * @param url
     * @return
     */
    public static String sendGet(String url, Map<String,String> map){
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = null;
        try{
            //创建uri
            URIBuilder builder = new URIBuilder(url);
            if (map != null){
                for (String key: map.keySet()){
                    builder.addParameter(key,map.get(key));
                }
            }
            URI uri = builder.build();
            //创建get请求
            HttpGet httpGet = new HttpGet(uri);
            //执行请求
            response =  httpClient.execute(httpGet);
            if (response.getStatusLine().getStatusCode() == 200){
                result = EntityUtils.toString(response.getEntity(),"UTF-8");

            }

        }catch (Exception e){

        }finally {
            try {
                httpClient.close();
                if (response != null){
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return result;
    }


    /*
     * 获取 二维码图片
     *
     */
    public static String getminiqrQr(String accessToken,String fileName, HttpServletRequest request) {
        String p=request.getSession().getServletContext().getRealPath("/");
        String codeUrl=p+"twoCode.png";
        String twoCodeUrl="twoCode.png";
        try
        {
            URL url = new URL("https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+accessToken);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");// 提交模式
            // conn.setConnectTimeout(10000);//连接超时 单位毫秒
            // conn.setReadTimeout(2000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            // 发送请求参数
            JSONObject paramJson = new JSONObject();
            paramJson.put("scene", "000");
            paramJson.put("path", "");
            paramJson.put("width", 430);
            paramJson.put("is_hyaline", true);
            paramJson.put("auto_color", true);
            /**
             * line_color生效
             * paramJson.put("auto_color", false);
             * JSONObject lineColor = new JSONObject();
             * lineColor.put("r", 0);
             * lineColor.put("g", 0);
             * lineColor.put("b", 0);
             * paramJson.put("line_color", lineColor);
             * */

            printWriter.write(paramJson.toString());
            // flush输出流的缓冲
            printWriter.flush();
            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(httpURLConnection.getInputStream());
            OutputStream os = new FileOutputStream(new File("D:/biyesheji/"
                    + fileName + ".png"));
            int len;
            byte[] arr = new byte[1024];
            while ((len = bis.read(arr)) != -1)
            {
                os.write(arr, 0, len);
                os.flush();
            }
            os.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return twoCodeUrl;
    }


    public static String requ(String url,HttpServletRequest req){

        byte[] bytes = new RestTemplate().postForObject(url,
                req, byte[].class);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        File file = new File("D:/121.jpg");
        try {
            BufferedImage img = ImageIO.read(bais);
            ImageIO.write(img, "jpg", file);
        } catch (IOException e) {
// log.error("【二维码生成失败】: {}", e.getMessage());
        }

        return "成功";
    }

    public static Map getminiqrQr(String sceneStr, String accessToken) {
        RestTemplate rest = new RestTemplate();
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            String url = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token="+accessToken;
            Map<String,Object> param = new HashMap<>();
            param.put("scene", sceneStr);
            param.put("path", "");
            param.put("width", 300);
            param.put("auto_color", false);
            Map<String,Object> line_color = new HashMap<>();
            line_color.put("r", 0);
            line_color.put("g", 0);
            line_color.put("b", 0);
            param.put("line_color", line_color);
            System.out.println("调用生成微信URL接口传参:" + param);
            MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
            HttpEntity requestEntity = new HttpEntity(param, headers);
            ResponseEntity<byte[]> entity = rest.exchange(url, HttpMethod.POST, requestEntity, byte[].class, new Object[0]);
            System.out.println("调用小程序生成微信永久小程序码URL接口返回结果:" + entity.getBody());
            byte[] result = entity.getBody();
            inputStream = new ByteArrayInputStream(result);

            File file = new File("D:/biyesheji/1.png");
            if (!file.exists()){
                file.createNewFile();
            }
            outputStream = new FileOutputStream(file);
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = inputStream.read(buf, 0, 1024)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.flush();
        } catch (Exception e) {
            System.out.println("调用小程序生成微信永久小程序码URL接口异常");
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}
