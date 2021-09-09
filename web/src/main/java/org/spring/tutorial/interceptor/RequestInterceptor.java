package org.spring.tutorial.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class RequestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.debug("preHandler method,handler value called ={}",handler);
        log.debug("preHandler method,request url value called ={}",request.getRequestURL());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.debug("postHandle method,handler value called ={}",handler);
        log.debug("postHandle method,request url value called ={}",request.getRequestURL());
        log.debug("postHandle method,model value called ={}",modelAndView.getModel());
        log.debug("postHandle method,View value called ={}",modelAndView.getView());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.debug("afterCompletion method,handler value called ={}",handler);
        log.debug("afterCompletion method,request url value called ={}",request.getRequestURL());
    }
}
