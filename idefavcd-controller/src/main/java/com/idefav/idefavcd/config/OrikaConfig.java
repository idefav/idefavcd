/*
 * Copyright (c) 2018 www.ceair.com Inc. All rights reserved.
 */
package com.idefav.idefavcd.config;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wuzishu
 * @version $Id OrikaConfig.java, v 0.1 2018-11-17 上午9:00 wuzishu Exp $$
 */
@Configuration
public class OrikaConfig {
    @Bean
    public MapperFactory mapperFactory() {
        return new DefaultMapperFactory.Builder().build();
    }

    @Bean
    public MapperFacade mapperFacade() {
        return mapperFactory().getMapperFacade();
    }
}
