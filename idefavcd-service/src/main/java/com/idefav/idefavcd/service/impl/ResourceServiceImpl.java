package com.idefav.idefavcd.service.impl;

import com.idefav.idefavcd.entity.Resource;
import com.idefav.idefavcd.mapper.ResourceMapper;
import com.idefav.idefavcd.service.IResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

}
