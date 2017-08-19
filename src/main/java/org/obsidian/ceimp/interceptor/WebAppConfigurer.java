package org.obsidian.ceimp.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by BillChen on 2017/8/18.
 */
@Configuration
public class WebAppConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new ManagerLogInterceptor())
                .addPathPatterns("/admin/**");
        registry.addInterceptor(new UserLogInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/")
                .excludePathPatterns("/login")
                .excludePathPatterns("/userLogin")
                .excludePathPatterns("/userLogout")
                .excludePathPatterns("/managerLogin")
                .excludePathPatterns("/managerLogout")
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/**");
        super.addInterceptors(registry);
    }
}
