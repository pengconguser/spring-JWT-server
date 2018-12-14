package com.list.listTest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class EnvConfig {
    @Autowired
    private Environment environment;

    public Integer getServerPort(){
        return environment.getProperty("server.port",Integer.class);
    }
}
