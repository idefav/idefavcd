package com.idefav.idefavcd.service.impl;

import com.idefav.idefavcd.entity.User;
import com.idefav.idefavcd.mapper.UserMapper;
import com.idefav.idefavcd.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author idefav
 * @since 2020-07-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
