package com.idefav.idefavcd.service.impl;

import com.idefav.idefavcd.entity.Content;
import com.idefav.idefavcd.mapper.ContentMapper;
import com.idefav.idefavcd.service.IContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置内容表 服务实现类
 * </p>
 *
 * @author idefav
 * @since 2020-06-21
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
