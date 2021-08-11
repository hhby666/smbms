package com.wlq.servlet.user;

import com.wlq.pojo.User;
import com.wlq.services.user.UserService;
import com.wlq.services.user.UserServiceImpl;
import com.wlq.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * program: smbms
 * <br>description: 登录验证serlvet
 *
 * @author by 王林清 on 2021/8/11
 * @version Java1.8 IntelliJ IDEA
 */
public class LoginServlet extends HttpServlet {
    //servlet控制层调用业务层

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet start ...");

        //获取用户名和密码
        String username = req.getParameter("userCode");
        String password = req.getParameter("userPassword");

        //和数据库中的密码进行对比，调用业务层
        UserService userService = new UserServiceImpl();
        User user = userService.login(username, password);

        if (user != null) {
            //查有此人，可以登录
            //将用户信息放入session中
            req.getSession().setAttribute(Constants.USER_SESSION, user);

            //跳转到主页
            resp.sendRedirect("jsp/frame.jsp");
        } else {
            //查无此人，无法登录，跳转回登录页面
            req.setAttribute("error", "用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
