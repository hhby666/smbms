package com.wlq.dao.user;

import com.wlq.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * program: smbms
 * <br>description: user dao接口
 *
 * @author by wlq on 2021/8/11
 * @version Java1.8 IDEA2021.1
 */
public interface UserDAO {
    /**
     * 获取要登录的用户的信息
     *
     * @param conn     数据库连接
     * @param userCode 用户编码
     * @return User 实体类
     * @throws SQLException 数据库连接异常
     * @author 王林清
     * @since 2021/8/11 16:44
     */
    User getLoginUser(Connection conn, String userCode) throws SQLException;
}
