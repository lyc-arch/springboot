package com.conner.springboot.service.Impl;


import com.conner.springboot.mapper.ConnerGoodsMapper;
import com.conner.springboot.pojo.ConnerGoods;
import com.conner.springboot.service.ConnerGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnerGoodsServiceImpl implements ConnerGoodsService {


    @Autowired
    private ConnerGoodsMapper connerGoodsMapper;


    /**
     * 通过物品类别把物品分类
     *
     * */
    @Override
    public List<ConnerGoods> findGoodsByName(String goCategory) {
        return connerGoodsMapper.findGoodsByName(goCategory);
    }

    /**
     * 找到4件物品
     *
     * */
    @Override
    public List<ConnerGoods> findFourGood(String goCategory) {
        return connerGoodsMapper.findFourGoods(goCategory);
    }


    /**
     * 通过id找到物品详细信息
     *
     * */
    @Override
    public ConnerGoods selectGoodById(String goId) {

        return connerGoodsMapper.findGoodById(goId);
    }

    /**根据评论数量排名
     *
     * */
    @Override
    public List<ConnerGoods> talknumber() {
        return connerGoodsMapper.talknumber();
    }


    /**共享成功*/
    @Override
    public void enjoyGood(ConnerGoods goods) {
        connerGoodsMapper.enjoyGood(goods);
    }

    @Override
    public List<ConnerGoods> findGood(String condition) {
        return connerGoodsMapper.findGood(condition);
    }

    /**
     * 通过usId找到租借物品*/
    @Override
    public List<ConnerGoods> findGoodByUsId(String usId) {
        return connerGoodsMapper.findGoodByUsId(usId);
    }

    /**
     * 通过adid找到物品信息
     *
     * */
    @Override
    public List<ConnerGoods> findGoodByAdId(String adId) {
        return connerGoodsMapper.findGoodByAdId(adId);
    }

    /**判断是否有该物品
     *
     * */
    @Override
    public ConnerGoods findGoodifrent(String goId) {
        return connerGoodsMapper.findGoodifrent(goId);
    }

    /**
     * 归还物品
     * @param :go*/
    @Override
    public void backGood(ConnerGoods go) {
        connerGoodsMapper.backGood(go);
    }
}
