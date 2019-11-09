package com.conner.springboot.controller;

import com.conner.springboot.pojo.ConnerAddress;
import com.conner.springboot.service.ConnerAdressService;
import com.conner.springboot.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ConnerAddressController {

    @Autowired
    private ConnerAdressService connerAdressService;

    /**
     * 附件的仓库
     *
     * */
    @RequestMapping("selectAdress")
    @ResponseBody
    public ResultData<Object> selectAdress(){
        List<ConnerAddress> addressList = connerAdressService.selectAdress();
        return ResultData.success(addressList);
    }

    /**
     * 找到仓库的名字
     * @param :adId
     * */
    @RequestMapping("selectAdressByAdId")
    @ResponseBody
    public ResultData<Object> selectAdressByUsId(String adId){
        ConnerAddress adList = connerAdressService.selectAdressByAdId(adId);
        return ResultData.success(adList);
    }
}
