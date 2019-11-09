package com.conner.springboot.mapper;


import com.conner.springboot.pojo.ConnerAddress;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ConnerAdressMapper {


    //附件仓库
    List<ConnerAddress> findAdress();

    //通过adId找到地址的详细信息
    ConnerAddress findAdressByAdId(String adId);
}
