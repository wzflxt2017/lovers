package com.lovers.java.controller;

import com.lovers.base.controller.CommonController;
import com.lovers.java.domain.SysFile;
import com.lovers.java.domain.SysUser;
import com.lovers.java.service.MoodService;
import com.lovers.java.service.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-26 09:10
 * @Description:
 */
@Controller
@RequestMapping("/mood")
public class MoodController extends CommonController {


    @Autowired
    private MoodService moodService;

    @Autowired
    private SysFileService sysFileService;

    @RequestMapping("/index")
    public String index(){
        return "java/mood/index";
    }

    @ResponseBody
    @RequestMapping("/uploadImages")
    public Object uploadImages(List<MultipartFile> files){
        SysUser sysUser = getSysUser();
        for(MultipartFile file:files){
            String fileName = file.getOriginalFilename();
            String[] split = fileName.split("\\.");
            SysFile sysFile = new SysFile();
            sysFile.setFileFullName(fileName);
            sysFile.setFileSuffix("."+split[1]);
            sysFile.setFileName(split[0]);
            sysFile.setFileType(split[1]);
            sysFile.setForModule("mood");
            sysFile.setUserId(sysUser.getUserId());
            sysFile.setUploadTime(Calendar.getInstance().getTime());
            int insert = sysFileService.insert(sysFile);
            try {
                File file1 = new File(getRootPath()+"mood"+ File.separator+sysFile.getFileId()+"_"+sysFile.getFileFullName());
                if(!file1.exists()){
                    file1.mkdirs();
                }
                file.transferTo(file1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        result.setSuccess(true);
        return result;
    }


}
