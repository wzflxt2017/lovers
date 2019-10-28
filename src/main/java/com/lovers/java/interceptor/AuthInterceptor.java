package com.lovers.java.interceptor;

import com.lovers.base.controller.BaseController;
import com.lovers.base.controller.CommonController;
import com.lovers.java.constants.CommonConstants;
import com.lovers.java.domain.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
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
        if(handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Object bean = handlerMethod.getBean();
            if(bean instanceof BaseController){
                request.setAttribute("reqData",((CommonController) bean).getReqData());
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if(handler instanceof HandlerMethod){
            log.info("----------------------------");
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Object bean = handlerMethod.getBean();
            if(bean instanceof CommonController){
                log.info("当前用户为：{}",((CommonController) bean).getSysUser().getUserName());
            }
            log.info("当前拦截的方法为：{}",handlerMethod.getMethod().getName());
            log.info("当前拦截的方法参数为：{}",request.getParameterMap().toString());
            log.info("当前拦截的方法为：{}",handlerMethod.getBean().getClass().getName());
            log.info("当前拦截的路径为：{}",request.getRequestURI());
//            System.out.println("当前拦截的方法为："+handlerMethod.getMethod().getName());
//            System.out.println("当前拦截的方法为："+handlerMethod.getBean().getClass().getName());
//            System.out.println("请求地址："+request.getRequestURI());
        }

    }
}
