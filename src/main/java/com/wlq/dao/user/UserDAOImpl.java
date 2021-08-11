package com.wlq.dao.user;

import com.wlq.pojo.User;
import com.wlq.util.DruidUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * program: smbms
 * <br>description: UserDAO实现
 *
 * @author by 王林清 on 2021/8/11
 * @version Java1.8 IntelliJ IDEA
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public User getLoginUser(Connection conn, String userCode) throws SQLException {
        User user = null;
        if (conn != null) {
            String sql = "select * from smbms_user where userCode=? limit 1";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userCode);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getLong("id"));
                user.setUserCode(userCode);
                user.setUserName(rs.getString("userName"));
                user.setUserPassword(rs.getString("UserPassword"));
                user.setGender(rs.getInt("gender"));
                user.setBirthday(rs.getDate("birthday"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setUserRole(rs.getInt("userRole"));
                user.setCreatedBy(rs.getLong("createdBy"));
                user.setCreationDate(rs.getDate("creationDate"));
                user.setModifyBy(rs.getLong("modifyBy"));
                user.setModifyDate(rs.getDate("modifyDate"));
            }
            DruidUtil.release(conn, ps, rs);
        }
        return user;
    }
}
