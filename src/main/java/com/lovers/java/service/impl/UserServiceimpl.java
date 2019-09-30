package com.lovers.java.service.impl;

import com.lovers.java.domain.SysUser;
import com.lovers.java.domain.SysUserExample;
import com.lovers.java.mapper.SysUserMapper;
import com.lovers.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-26 09:16
 * @Description:
 */
@Service
public class UserServiceimpl implements UserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findByName(String userName) {
        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        return sysUserMapper.selectByExample(userExample);
    }
}