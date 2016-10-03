package com.easylearnjava.api.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.easylearnjava.api")
public class AspectConfig {
}
 