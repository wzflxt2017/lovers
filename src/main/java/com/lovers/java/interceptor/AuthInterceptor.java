package com.lovers.java.interceptor;

import com.lovers.java.constants.CommonConstants;
import com.lovers.java.domain.SysUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object attribute = session.getAttribute(CommonConstants.SESSION_USER);
        if(attribute!=null){
//            session.setAttribute(CommonConstants.SESSION_USER,attribute);
            session.setAttribute(CommonConstants.IS_LOGIN,true);
        }else{
            session.setAttribute(CommonConstants.IS_LOGIN,false);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
