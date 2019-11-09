package com.conner.springboot.service.Impl;

import com.conner.springboot.mapper.ConnerOrderMapper;
import com.conner.springboot.pojo.ConnerOrder;
import com.conner.springboot.service.ConnerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Repository
public class ConnerOrderServiceImpl implements ConnerOrderService {

    @Autowired
    private ConnerOrderMapper connerOrderMapper;

    /**
     * 通过usid查询订单*/
    @Override
    public List<ConnerOrder> selectOrderbyusid(String usid) {
        return connerOrderMapper.findOrderbyusid(usid);
    }


    /**
     * 增加订单
     *
     * */
    @Override
    public void insertOrder(ConnerOrder connerOrder) {

        connerOrderMapper.insertOrder(connerOrder);

    }

    /**
     * 完成订单
     * @param :adid*/
    @Override
    public void back(String adid) {
        connerOrderMapper.back(adid);
    }


    /**
     * 根据订单状态找订单
     *
     * */
    @Override
    public List<ConnerOrder> selectOrderByStatus(String orStuats) {
        return connerOrderMapper.findOrderByStatus(orStuats);
    }
}
