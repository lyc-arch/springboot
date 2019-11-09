package com.conner.springboot.service.Impl;

import com.conner.springboot.mapper.ConnerUserMapper;
import com.conner.springboot.pojo.ConnerUser;
import com.conner.springboot.service.ConnerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Repository
public class ConnerUserServiceImpl implements ConnerUserService {

    @Autowired
    private ConnerUserMapper connerUserMapper;

    /**
     * 判断用户是否存在
     *
     * */
    @Override
    public List<ConnerUser> findUserIfExit(String openid) {
        return connerUserMapper.findUserIfExit(openid);
    }

    /**
     * 增加用户
     *
     * */
    @Override
    public void insertUser(ConnerUser user) {
        
        connerUserMapper.addUser(user);
    }

    /**
     *
     * *查询用户租借的物品
     *
     * */
    @Override
    public ConnerUser myrentGood(String usId) {
        return connerUserMapper.myrentGood(usId);
    }
}
