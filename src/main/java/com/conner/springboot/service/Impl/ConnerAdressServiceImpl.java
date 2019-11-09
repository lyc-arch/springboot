package com.conner.springboot.service.Impl;

import com.conner.springboot.mapper.ConnerAdressMapper;
import com.conner.springboot.pojo.ConnerAddress;
import com.conner.springboot.service.ConnerAdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class ConnerAdressServiceImpl implements ConnerAdressService {

    @Autowired
    private ConnerAdressMapper connerAdressMapper;

    /**
     * 附件仓库
     *
     * */
    @Override
    public List<ConnerAddress> selectAdress() {
        return connerAdressMapper.findAdress();
    }


    /**
     * 通过adId找到地址详细信息*/
    @Override
    public ConnerAddress selectAdressByAdId(String adId) {
        return connerAdressMapper.findAdressByAdId(adId);
    }
}
