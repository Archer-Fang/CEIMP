package org.obsidian.ceimp.interceptor;

import org.apache.log4j.Logger;
import org.obsidian.ceimp.bean.ManagerBean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by BillChen on 2017/10/14.
 */
public class MLogInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession(true);
        ManagerBean managerBean = (ManagerBean) session.getAttribute("managerBean");
        if(managerBean != null){
            return true;
        }
        else{
            logger.info("没有管理员在线");
            httpServletResponse.sendRedirect("/Login");
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