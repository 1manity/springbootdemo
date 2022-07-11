package com.task.config;


import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        //定义MP拦截器
        MybatisPlusInterceptor mp=new MybatisPlusInterceptor();
        //添加具体的拦截器
        mp.addInnerInterceptor(new PaginationInnerInterceptor());
        return mp;
    }
}
