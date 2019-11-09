package com.conner.springboot.service;


import com.conner.springboot.pojo.ConnerOrder;
import java.util.List;


public interface ConnerOrderService {


    //通过usid找到订单
    List<ConnerOrder> selectOrderbyusid(String usid);

    //增加订单
    void insertOrder(ConnerOrder connerOrder);

    //已完成
    void back(String adid);

    //根据状态找到订单
    List<ConnerOrder> selectOrderByStatus(String orStuats);
}
