package com.wlq.servlet.user;

import com.wlq.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * program: smbms
 * <br>description: 注销功能
 *
 * @author by 王林清 on 2021/8/11
 * @version Java1.8 IntelliJ IDEA
 */
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //移除用户的登录信息session
        req.getSession().removeAttribute(Constants.USER_SESSION);
        //返回登录页面
        resp.sendRedirect(req.getContextPath() + "/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
