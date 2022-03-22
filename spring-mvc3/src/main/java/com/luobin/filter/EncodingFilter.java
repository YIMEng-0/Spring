package com.luobin.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Doraemon
 * @date 2022/3/21 1:40 下午
 * @version 1.0
 */
public class EncodingFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 使用过滤器解决乱码的问题
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");

        // 继续执行下面的链条，放置程序卡掉
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
