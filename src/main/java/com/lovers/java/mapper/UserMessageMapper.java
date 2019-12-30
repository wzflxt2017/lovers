package com.lovers.java.mapper;


import com.lovers.java.domain.UserMessage;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMessageMapper extends Mapper<UserMessage> {

    List<UserMessage> findMessageByUserId(@Param("senderId") Integer sender, @Param("receiverId")Integer receiver);


}