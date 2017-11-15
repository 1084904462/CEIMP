package org.obsidian.ceimp.interceptor;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.UserLogBean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by BillChen on 2017/8/18.
 */
public class UserLogInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession(true);
        UserLogBean userLogBean = (UserLogBean) session.getAttribute("userLogBean");
        if(userLogBean != null){
            return true;
        }
        else{
            logger.info("没有用户在线");
            httpServletResponse.sendRedirect("/login");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
