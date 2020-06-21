package com.idefav.idefavcd.service.impl;

import com.idefav.idefavcd.entity.App;
import com.idefav.idefavcd.mapper.AppMapper;
import com.idefav.idefavcd.service.IAppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用表 服务实现类
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements IAppService {

}
