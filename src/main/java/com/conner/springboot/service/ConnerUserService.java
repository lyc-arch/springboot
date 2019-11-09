package com.conner.springboot.service;

import com.conner.springboot.pojo.ConnerUser;

import java.util.List;

public interface ConnerUserService {

    //用户是否存在
    List<ConnerUser> findUserIfExit(String openid);

    //增加用户
    void insertUser(ConnerUser user);

    //查询用户租借的物品
    ConnerUser myrentGood(String usId);
}
