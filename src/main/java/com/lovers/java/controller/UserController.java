package com.lovers.java.controller;

import com.lovers.base.controller.CommonController;
import com.lovers.java.constants.CommonConstants;
import com.lovers.java.domain.SysFile;
import com.lovers.java.domain.SysUser;
import com.lovers.java.service.SysFileService;
import com.lovers.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-10-24 10:20
 * @Description:
 */
@Controller
@RequestMapping("/user/center")
public class UserController extends CommonController {


    @Autowired
    private UserService userService;

    @Autowired
    private SysFileService sysFileService;

    @RequestMapping("userCenter")
    public String userCenter(){
        SysUser sysUser = getSysUser();
        reqData.put("sysUser",sysUser);
//        setRequestAttr("sysUser",sysUser);
        return "java/user/userCenter";
    }


    @ResponseBody
    @RequestMapping("updateUser")
    public Object updateUser(SysUser sysUser){
        userService.updateUser(sysUser);
        SysUser newUser = userService.findById(sysUser.getUserId());
        session.setAttribute(CommonConstants.SESSION_USER,newUser);
        result.setSuccess(true);
        return result;
    }

    @ResponseBody
    @RequestMapping("updateUserPhoto")
    public Object updateUserPhoto(@RequestParam("multipartFile") MultipartFile multipartFile){
        SysUser sysUser = getSysUser();
        SysFile file = sysFileService.uploadImageByModule(multipartFile, "user", sysUser);
        sysUser.setUserPhoto(file.getFileId());
        //更新用户
        userService.updateUser(sysUser);
        SysUser newUser = userService.findById(sysUser.getUserId());
        session.setAttribute(CommonConstants.SESSION_USER,newUser);
        result.setData(file);
        result.setSuccess(true);
        return result;
    }


    @RequestMapping("friend")
    public String friend(){
        SysUser sysUser = getSysUser();
        List<SysUser> sysUsers = userService.selectFriendById(sysUser.getUserId());
        reqData.put("sysUser",sysUser);
        reqData.put("sysUsers",sysUsers);
        return "java/user/friend";
    }

    @RequestMapping("/toAddfriend")
    public String toAddfriend(){
        SysUser sysUser = getSysUser();
        reqData.put("sysUser",sysUser);
        return "java/user/toAddfriend";
    }

    @ResponseBody
    @RequestMapping("/searchUsersByNameOrAccount")
    public Object searchUsersByNameOrAccount(@RequestParam("userName") String userName){
        List<SysUser> sysUsers = userService.searchUsersByNameOrAccount(userName);
        result.setData(sysUsers);
        return result;
    }

}
