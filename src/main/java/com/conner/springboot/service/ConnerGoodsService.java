package com.conner.springboot.service;

import com.conner.springboot.pojo.ConnerGoods;

import java.util.List;

public interface ConnerGoodsService {

    //找到物品的类别通过名字
    List<ConnerGoods> findGoodsByName(String goCategory);

    //找到4件物品
    List<ConnerGoods> findFourGood(String goCategory);

    //通过id找到物品详细信息
    ConnerGoods selectGoodById(String goId);

    //根据评论数量排名
    List<ConnerGoods> talknumber();

    //共享成功
    void enjoyGood(ConnerGoods goods);

    //搜索
    List<ConnerGoods> findGood(String condition);

    //通过usid找到物品
    List<ConnerGoods> findGoodByUsId(String usId);

    //通过adId找到物品信息
    List<ConnerGoods> findGoodByAdId(String adId);

    //判断是否有该物品
    ConnerGoods findGoodifrent(String goId);

    //归还物品
    void backGood(ConnerGoods goId);
}
