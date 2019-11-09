package com.conner.springboot.mapper;


import com.conner.springboot.pojo.ConnerGoods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ConnerGoodsMapper {


    //通过物品类别把物品分类
    List<ConnerGoods> findGoodsByName(String goCategory);

    //找出4件物品
    List<ConnerGoods> findFourGoods(String goCategory);

    //通过id找到物品详细信息
    ConnerGoods findGoodById(String goId);

    //根据评论的数量排名
    List<ConnerGoods> talknumber();


    //共享成功
    void enjoyGood(ConnerGoods goods);

    //搜索
    List<ConnerGoods> findGood(String condition);

    //通过usid找到租借物品
    List<ConnerGoods> findGoodByUsId(String usId);

    //通过adId找到物品信息
    List<ConnerGoods> findGoodByAdId(String adId);

    //判断是否有该物品
    ConnerGoods findGoodifrent(String goId);

    //归还物品
    void backGood(ConnerGoods go);
}
