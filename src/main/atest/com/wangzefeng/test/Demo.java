package com.wangzefeng.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-10-28 15:31
 * @Description:
 */
public class Demo {

    public static void main(String[] args) {
        String s1="hi";
        List<String> list=new ArrayList<>();
        list.add(s1);
        modi(s1,list);
        System.out.println(s1+list);
    }

    public static void modi(String s1,List<String> list){
        s1="hello";
        list=new ArrayList<>();
        list.add(s1);
    }

    class Student{

    }
}
