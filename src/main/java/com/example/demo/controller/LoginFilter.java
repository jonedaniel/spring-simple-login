package com.example.demo.controller;

import com.example.demo.util.UserContext;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Object loginSuccess = UserContext.getSession().getAttribute("LoginSuccess");
        Object errorTimes   = UserContext.getSession().getAttribute("ErrorTimes");

        //放行页面
        if (("http://localhost/login").equals(String.valueOf(UserContext.getRequest().getRequestURL()))||
                "http://localhost/error".equals(String.valueOf(UserContext.getRequest().getRequestURL()))) {
            chain.doFilter(UserContext.getRequest(), UserContext.getResponse());
            return;
        }


        //登陆拦截逻辑
        if (errorTimes != null && (Integer) errorTimes >= 3) {
            UserContext.getResponse().sendRedirect("/error");
            chain.doFilter(request, response);
            return;
        }

        if (loginSuccess == null) {
            UserContext.getResponse().sendRedirect("/login");
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
