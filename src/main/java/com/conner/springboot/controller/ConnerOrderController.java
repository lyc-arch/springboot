package com.conner.springboot.controller;

import com.conner.springboot.pojo.ConnerOrder;
import com.conner.springboot.service.ConnerOrderService;
import com.conner.springboot.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ConnerOrderController {

    @Autowired
    private ConnerOrderService connerOrderService;


    /**
     * 通过usid找到订单
     * @param ：usid
     *
     * */
    @RequestMapping("selectOrderByusid")
    @ResponseBody
    public ResultData<Object> selectOrderByusid(String usid){

        List<ConnerOrder> orderlist = connerOrderService.selectOrderbyusid(usid);

        return ResultData.success(orderlist);

   }

   /**
    * 根据租借状态找到订单
    * @param :orStatus
    *
    * */
   @RequestMapping("selectOrderByStatus")
    @ResponseBody
    public ResultData<Object> selectOrderByStatus(String orStuats){

       List<ConnerOrder> orders= connerOrderService.selectOrderByStatus(orStuats);
       return ResultData.success(orders);
   }
}
