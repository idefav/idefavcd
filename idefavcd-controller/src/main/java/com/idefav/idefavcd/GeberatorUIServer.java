package com.idefav.idefavcd;

import com.github.davidfantasy.mybatisplus.generatorui.GeneratorConfig;
import com.github.davidfantasy.mybatisplus.generatorui.MybatisPlusToolsApplication;

public class GeberatorUIServer {
    public static void main(String[] args) {
        GeneratorConfig config = GeneratorConfig.builder().jdbcUrl("jdbc:mysql://192.168.0.120:32051/db_idefavcd")
                .userName("root")
                .password("111111")
                .driverClassName("com.mysql.jdbc.Driver")
                .basePackage("com.idefav.idefavcd")
                .port(8068)
                .build();
        MybatisPlusToolsApplication.run(config);
    }
}
