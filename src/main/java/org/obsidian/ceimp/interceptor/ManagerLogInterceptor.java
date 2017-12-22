package org.obsidian.ceimp.interceptor;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ManagerLogBean;
import org.obsidian.ceimp.controller.LoginController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by BillChen on 2017/8/18.
 */
public class ManagerLogInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession(true);
        Object managerLog = session.getAttribute("managerLogBean");
        if(managerLog != null){
            if(managerLog == ""){
                session.setAttribute("managerLogBean",null);
                response.sendRedirect("/loginInvalid");
                return false;
            }
            else{
                ManagerLogBean managerLogBean = (ManagerLogBean) session.getAttribute("managerLogBean");
                HttpSession preSession = LoginController.getManagerSessionMap().get(managerLogBean.getManagerId());
                if(session.getId().equals(preSession.getId())){
                    return true;
                }
            }
        }
        logger.info("当前登录管理员身份失效");
        response.sendRedirect("/login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
