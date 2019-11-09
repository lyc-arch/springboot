package com.conner.springboot.controller;


import com.conner.springboot.pojo.ConnerGoods;
import com.conner.springboot.pojo.ConnerOrder;
import com.conner.springboot.pojo.ConnerUser;
import com.conner.springboot.service.ConnerGoodsService;
import com.conner.springboot.service.ConnerOrderService;
import com.conner.springboot.utils.ResultData;
import com.conner.springboot.utils.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :conner
 * @date:2019/10/5
 * @name: 商品信息类
 */

@Controller
@RequestMapping("")
public class ConnerGoodsController {


    @Autowired
    private ConnerGoodsService connerGoodsService;

    @Autowired
    private ConnerOrderService connerOrderService;


    /**
     * @name: 通过物品类别把物品分类
     * @param :goCategory 物品类型
     *  */
    @RequestMapping("connerGoodsList")
    @ResponseBody
    public ResultData<Object> connerGoodsList(String goCategory){

        List<ConnerGoods> goodsList = connerGoodsService.findGoodsByName(goCategory);
        return ResultData.success(goodsList);
    }


    /**
     * @name: 通过物品类别显示4件物品
     * @param :gocategory 物品类型
     *
     * */
    @RequestMapping("connnerGoodFour")
    @ResponseBody
    public ResultData<Object> connerGoodFour(String goCategory,String study){
         int caPage =0;
         int pagenum = 4;
         Map<String,Object> parm = new HashMap<String,Object>();
        List<ConnerGoods> connerGoodsList = connerGoodsService.findFourGood(goCategory);
        List<ConnerGoods> studyList = connerGoodsService.findFourGood(study);
        parm.put("connerGoodsList",connerGoodsList);
        parm.put("studyList",studyList);
        return ResultData.success(parm);
    }

    /**
     * 通过物品id找到该物品的详细信息
     * @parm:goId
     *
     * */
    @RequestMapping("selectGoodById")
    @ResponseBody
    public ResultData<Object> selectGoodById(String goId){
        ConnerGoods connerGoods=connerGoodsService.selectGoodById(goId);
        return ResultData.success(connerGoods);

    }

    /**
     * 根据评论的数量排名
     *
     * */
    @RequestMapping("talkNumber")
    @ResponseBody
    public ResultData<Object> talkNumber(){
        List<ConnerGoods> talkList = connerGoodsService.talknumber();
        return ResultData.success(talkList);
    }

    /**共享成功
     * @param :  goods:物品
     *
     *
     * **/
    @RequestMapping("enjoyGoood")
    @ResponseBody
    public ResultData<Object> enjoyGood(ConnerGoods goods){

        goods.setGoNumber(goods.getGoNumber()+1);
        goods.setGoGoodStatus("已租借");
        ConnerOrder connerOrder = new ConnerOrder();
        connerOrder.setOrId(UuidUtil.getUUID());
        connerOrder.setOrBackDate(goods.getGoBackDate());
        connerOrder.setOrImage(goods.getGoMasterImage());
        connerOrder.setOrMaster(goods.getGoMasterName());
        connerOrder.setOrName(goods.getGoName());
        connerOrder.setOrPrice(goods.getGoAllPrice());
        connerOrder.setUsid(goods.getUsid());
        connerOrder.setOrRentDate(goods.getGoRentDate());
        connerOrder.setOrStuats("租借中");
        connerOrder.setGoid(goods.getGoId());


        connerGoodsService.enjoyGood(goods);
        connerOrderService.insertOrder(connerOrder);
        return ResultData.success();
    }

    @RequestMapping("findGood")
    @ResponseBody
    public ResultData<Object> findGood(String condition){

        List<ConnerGoods> goodsList = connerGoodsService.findGood(condition);

        return ResultData.success(goodsList);
    }


    /**
     * 通过adID找到物品
     *
     * */
    @RequestMapping("findGoodByAdId")
    @ResponseBody
    public ResultData<Object> findGoodByAdId(String adId){
        List<ConnerGoods> adList = connerGoodsService.findGoodByAdId(adId);

        return ResultData.success(adList);
    }

    /**
     * 通过goid判断是否有该物品和是否已租借
     * @param :goid
     *
     * */
    @RequestMapping("findGoodifrent")
    @ResponseBody
    public ResultData<Object> findGoodifrent(String goId){
        ConnerGoods good = connerGoodsService.findGoodifrent(goId);

        if(good==null){
            return ResultData.fail();
        }else {
            return ResultData.success(good);
        }

    }


    /**
     * 归还物品
     * @param :goid
     *
     * */
    @RequestMapping("backGood")
    @ResponseBody
    public ResultData<Object> backGood(ConnerGoods go){

        go.setGoGoodStatus("预约共享");
        go.setGoButtonColor("#e54d42");
        connerGoodsService.backGood(go);
        connerOrderService.back(go.getGoId());
        return ResultData.success();

    }
}
