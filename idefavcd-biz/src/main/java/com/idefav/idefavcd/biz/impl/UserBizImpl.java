package com.idefav.idefavcd.biz.impl;

import com.idefav.idefavcd.LoginRequest;
import com.idefav.idefavcd.biz.UserBiz;
import com.idefav.idefavcd.entity.User;
import com.idefav.idefavcd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements UserBiz {

    @Autowired
    private IUserService userService;

    @Override
    public Boolean login(LoginRequest request) {
        return userService.lambdaQuery().eq(User::getUserName, request.getUserName())
                .eq(User::getPassword, request.getPassword()).count() > 0;
    }
}
