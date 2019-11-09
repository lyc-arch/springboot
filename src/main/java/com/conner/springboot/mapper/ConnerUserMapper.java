package com.conner.springboot.mapper;


import com.conner.springboot.pojo.ConnerUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ConnerUserMapper {

    //看是否存在该用户
    List<ConnerUser> findUserIfExit(String openid);

    //增加用户
    void addUser(ConnerUser user);

    //查询用户租借的物品
    ConnerUser myrentGood(String usId);
}
