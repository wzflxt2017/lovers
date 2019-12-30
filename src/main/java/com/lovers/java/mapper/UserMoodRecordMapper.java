package com.lovers.java.mapper;

import com.lovers.java.domain.SysUser;
import com.lovers.java.domain.UserMoodRecord;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;


public interface UserMoodRecordMapper extends Mapper<UserMoodRecord> {

    List<UserMoodRecord> selectByUsers(@Param("sysUsers") List<SysUser> sysUsers);
}