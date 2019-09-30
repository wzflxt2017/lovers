package com.lovers.java.mapper;

import com.lovers.java.domain.UserFriend;
import com.lovers.java.domain.UserFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;



public interface UserFriendMapper{

    long countByExample(UserFriendExample example);

    int deleteByExample(UserFriendExample example);

    int deleteByPrimaryKey(Integer userFriendId);

    int insert(UserFriend record);

    int insertSelective(UserFriend record);

    List<UserFriend> selectByExample(UserFriendExample example);


    UserFriend selectByPrimaryKey(Integer userFriendId);

    int updateByExampleSelective(@Param("record") UserFriend record, @Param("example") UserFriendExample example);


    int updateByExample(@Param("record") UserFriend record, @Param("example") UserFriendExample example);


    int updateByPrimaryKeySelective(UserFriend record);

    int updateByPrimaryKey(UserFriend record);
}