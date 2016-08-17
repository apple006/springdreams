package com.springDreamsProj.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({ "com.springDreamsProj" })
@EnableAspectJAutoProxy
public class AspectConfig {

}
