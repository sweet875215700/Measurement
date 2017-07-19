package com.me.sweet;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by weisw.shi on 2017/7/18.
 */
public class ServletInitializer extends SpringBootServletInitializer{


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(TestApplication.class);
    }
}
