package com.wlq.filter;

import com.wlq.util.Constants;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * program: smbms
 * <br>description: 权限过滤
 *
 * @author by 王林清 on 2021/8/11
 * @version Java1.8 IntelliJ IDEA
 */
public class SysFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //强转请求和响应
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        //过滤器，从session中获取用户
        Object user = req.getSession().getAttribute(Constants.USER_SESSION);
        if (user == null) {
            //已经注销或未登录，转到错误页面
            resp.sendRedirect(req.getContextPath() + "/syserror.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }
}
