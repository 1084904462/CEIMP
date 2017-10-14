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
        logger.info("=============Load Static Resources=============");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        logger.info("=============Load Interceptors=============");
        registry.addInterceptor(new ManagerLogInterceptor())
                .addPathPatterns("/admin/**");
        registry.addInterceptor(new UserLogInterceptor())
                .addPathPatterns("/evaluation/**");
        registry.addInterceptor(new ULogInterceptor())
                .addPathPatterns("/u/**");
        registry.addInterceptor(new MLogInterceptor())
                .addPathPatterns("/m/**");
        super.addInterceptors(registry);
    }
}
