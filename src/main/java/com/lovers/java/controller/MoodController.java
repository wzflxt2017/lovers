package com.lovers.java.controller;

import com.lovers.base.controller.CommonController;
import com.lovers.base.service.BaseService;
import com.lovers.java.domain.UserMoodRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-26 09:10
 * @Description:
 */
@Controller
@RequestMapping("/mood")
public class MoodController extends CommonController {


    @Autowired
    private BaseService<UserMoodRecord,Integer> baseService;

    @RequestMapping("/index")
    public String index(){
        return "java/mood/index";
    }


}
