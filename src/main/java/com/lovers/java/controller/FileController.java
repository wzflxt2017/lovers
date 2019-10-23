package com.lovers.java.controller;

import com.lovers.base.controller.CommonController;
import com.lovers.java.domain.SysFile;
import com.lovers.java.service.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;

/**
 * @Auther: wangzefeng
 * @Date: 2019-10-18 10:28
 * @Description:
 */
@Controller
@RequestMapping("/sys/file")
public class FileController extends CommonController {

    @Autowired
    private SysFileService sysFileService;

    @ResponseBody
    @RequestMapping("/loadImagesByIds")
    public Object loadImagesByIds(String imageId){
        SysFile sysFile = sysFileService.selectByPrimaryKey(Integer.parseInt(imageId));
        return sysFile;
    }

}
