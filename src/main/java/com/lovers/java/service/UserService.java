package com.lovers.java.service;


import com.lovers.java.domain.SysUser;

import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-26 09:16
 * @Description:
 */
public interface UserService {

    List<SysUser> findByName(String userName);
    SysUser findById(Integer userId);

    List<SysUser> selectFriendById(Integer userId);
    void updateUser(SysUser sysUser);

}
