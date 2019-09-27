package com.lovers.base.service;

import com.lovers.base.mapper.BaseMapper;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-27 22:14
 * @Description:
 */
public interface BaseService<E,PK> {
    int insert(E e);
    int deleteByPrimaryKey(PK pk);
    E selectByPrimaryKey(PK pk);
    int updateByPrimaryKey(E e);
}
