package com.conner.springboot.mapper;


import com.conner.springboot.pojo.ConnerOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ConnerOrderMapper {

    //通过usid找到订单
    List<ConnerOrder> findOrderbyusid(String usid);


    //增加订单
    void insertOrder(ConnerOrder connerOrder);

    //完成订单
    void back(String adid);

    //根据订单状态找到订单
    List<ConnerOrder> findOrderByStatus(String orStuats);
}
