package com.st.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.st.reggie.common.BaseContext;
import com.st.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName: LoginCheckFilter
 * @Version: 1.0
 * @Description: 检查用户是否已经完成登录
 * @Author song
 * @Date 2022/8/3 21:07
 */
@WebFilter(filterName = "loginCheckFilter",urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    //路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        log.info("拦截到请求：{}",request.getRequestURI());

        //1.获取本次请求的URL
        String requestURL = request.getRequestURI();

        //定义不需要处理的请求路径
        String[] urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/common/**",
                "/user/sendMsg", //移动端发送短信
                "/user/login" //移动端登录
        };

        //2。判断本次请求是否想要处理
        boolean check = check(urls,requestURL);

        //3.如果不需要处理，则直接放行
        if (check){
            log.info("本次请求{}不需要处理",requestURL);
            filterChain.doFilter(request,response);
            return;
        }

        //4-1.判断登录状态，如果已经登录，则直接放行
        if (request.getSession().getAttribute("employee") != null){
            log.info("用户已经登录，id为:{}",request.getSession().getAttribute("employee"));

            Long empId = (Long)request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(empId);
            //已经登录了
            filterChain.doFilter(request, response);
            return;
        }

        //4-2.判断登录状态，如果已经登录，则直接放行
        if (request.getSession().getAttribute("user") != null){
            log.info("用户已经登录，id为:{}",request.getSession().getAttribute("user"));

            Long userId = (Long)request.getSession().getAttribute("user");
            BaseContext.setCurrentId(userId);
            //已经登录了
            filterChain.doFilter(request, response);
            return;
        }

        log.info("用户未登录");

        //5.如果未登录则返回未登录结果，通过输出流的方式向客户端页面响应数据
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
    }

    /**
     * 路径匹配，检查本次请求是否需要放行
     * @param requestURL
     * @return
     */
    public boolean check(String[] urls,String requestURL){
        for (String url : urls){
            boolean match = PATH_MATCHER.match(url,requestURL);
            if (match){
                return true;
            }
        }
        return false;
    }
}
