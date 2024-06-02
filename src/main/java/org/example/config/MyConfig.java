package org.example.config;

/**
 * ClassName: WebMvcConfigurer
 * Package: org.example.config
 * Description:
 *
 * @Author 闵昌浩
 * @Create 2024/5/13 21:28
 * @Version 1.0
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyConfig implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //扫描static下的所有html页面
        registry.addResourceHandler("classpath:/static/*.html");
        //扫描static下的所有资源
        registry.addResourceHandler("/static/**");
    }
}

