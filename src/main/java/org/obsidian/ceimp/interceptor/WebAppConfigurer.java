package org.obsidian.ceimp.interceptor;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by BillChen on 2017/8/18.
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {
        private Logger logger = Logger.getLogger(this.getClass());

    public WebAppConfigurer(){
        super();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        logger.debug("=============Load Static Resources=============");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        logger.debug("=============Load Interceptors=============");
        registry.addInterceptor(new ManagerLogInterceptor())
                .addPathPatterns("/manager/**");
        registry.addInterceptor(new UserLogInterceptor())
                .addPathPatterns("/scholarship/**")
                .addPathPatterns("/evaluation/**");

        super.addInterceptors(registry);
    }
}
