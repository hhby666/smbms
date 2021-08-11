package com.wlq.services.user;

import com.wlq.pojo.User;

/**
 * program: smbms
 * <br>description: user业务层接口
 *
 * @author by 王林清 on 2021/8/11
 * @version Java1.8 IntelliJ IDEA
 */
public interface UserService {
    /**
     * 利用DAO层获取用户
     *
     * @param userCode 用户编码
     * @param password 用户密码
     * @return 一个user类
     * @author 王林清
     * @since 2021/8/11 18:02
     */
    User login(String userCode, String password);
}
