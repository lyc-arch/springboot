package com.conner.springboot.controller;

import com.conner.springboot.pojo.ConnerGoods;
import com.conner.springboot.pojo.ConnerUser;
import com.conner.springboot.service.ConnerGoodsService;
import com.conner.springboot.service.ConnerUserService;
import com.conner.springboot.utils.JsonUtil;
import com.conner.springboot.utils.LoginUntil;
import com.conner.springboot.utils.ResultData;
import com.conner.springboot.utils.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.conner.springboot.utils.LoginUntil.getUserInfo;

@Controller
public class ConnerUserController {

    private final String APPID ="wx33489807911b466c";
    private final String SECET ="e5b0a6e7d6fc49d42a2827009bb46a7c";

    @Autowired
    private ConnerUserService connerUserService;

    @Autowired
    private ConnerGoodsService connerGoodsService;


    @RequestMapping("login")
    @ResponseBody
    public ResultData<Object> UserLogi(HttpServletRequest httpRequest) throws IOException {

        String url ="https://api.weixin.qq.com/sns/jscode2session";//请求的地址
        String appId = APPID;//开发者对应的AppID
        String appSecret = SECET;//开发者对应的AppSecret
        String grant_type = " authorization_code";

        String code= httpRequest.getParameter("code");
        String encryptedData= httpRequest.getParameter("encryptedData");
        String iv= httpRequest.getParameter("iv");
        Map<String,String> map = new HashMap<String,String>();
        map.put("appid",appId);
        map.put("secret",appSecret);
        map.put("js_code",code);
        map.put("grant_type",grant_type);
        String wxReturnValue = LoginUntil.sendPost(url, map);
        System.out.println(wxReturnValue);
        Map<String,Object> tempMap = JsonUtil.convertJson2Object(wxReturnValue, Map.class);
        String openid = tempMap.get("openid").toString();
        ConnerUser user = new ConnerUser();
        List<ConnerUser> list = connerUserService.findUserIfExit(openid);
        System.out.println(list);
        if(list != null && list.size() > 0){
            return ResultData.success(list);
        }else {
          String  session_key = tempMap.get("session_key").toString();
            Map<String,String> userMap = getUserInfo(encryptedData, session_key, iv);
            String nickName = userMap.get("nickName");
            String avatarUrl = userMap.get("avatarUrl");
            String gender = String.valueOf(userMap.get("gender"));
            String province = userMap.get("province");
            String city = userMap.get("city");
            String country = userMap.get("country");
            user.setUsId(UuidUtil.getUUID());
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            user.setUsDate(dateFormat.format(date));
            user.setUsImage(avatarUrl);
            user.setUsIntegral(100);
            user.setUsOpenId(openid);
            user.setUsName(nickName);
            connerUserService.insertUser(user);

            return ResultData.success(user);

        }
    }

    /**
     * 查找我租借的物品
     * @parm:usId 用户id
     *
     * */
    @RequestMapping("myrentGood")
    @ResponseBody
    public ResultData<Object> myrentGood(String usId){
        ConnerUser usList = connerUserService.myrentGood(usId);
        List<ConnerGoods> goodsList = connerGoodsService.findGoodByUsId(usId);
        usList.setConnerGoodsList(goodsList);

        return ResultData.success(usList);
    }
}
