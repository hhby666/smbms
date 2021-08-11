package com.wlq.services.user;

import com.wlq.dao.user.UserDAO;
import com.wlq.dao.user.UserDAOImpl;
import com.wlq.pojo.User;
import com.wlq.util.DruidUtil;

import java.sql.Connection;

/**
 * program: smbms
 * <br>description: user业务层接口实现
 *
 * @author by 王林清 on 2021/8/11
 * @version Java1.8 IntelliJ IDEA
 */
public class UserServiceImpl implements UserService {

    /**
     * 业务层都会调用DAO层，所以我们要引入DAO层
     */
    private final UserDAO userDAO;

    public UserServiceImpl() {
        userDAO = new UserDAOImpl();
    }

    @Override
    public User login(String userCode, String password) {
        Connection conn = null;
        User user = null;

        try {
            conn = DruidUtil.getConnection();

            //通过业务层调用具体数据库操作
            user = userDAO.getLoginUser(conn, userCode);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DruidUtil.release(conn);
        }
        if (user == null) {
            return null;
        } else {
            if (password.equals(user.getUserPassword())) {
                return user;
            } else {
                return null;
            }
        }
    }
}
