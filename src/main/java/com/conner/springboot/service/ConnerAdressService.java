package com.conner.springboot.service;


import com.conner.springboot.pojo.ConnerAddress;

import java.util.List;

public interface ConnerAdressService {


    //附件仓库
    List<ConnerAddress> selectAdress();

    //通过Id找到地址详细信息
    ConnerAddress selectAdressByAdId(String adId);
}
