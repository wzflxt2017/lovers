package com.lovers.java.controller.common;

import com.lovers.java.constants.CommonConstants;
import com.lovers.java.domain.SysUser;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CommonController extends BaseController{



    public SysUser getSysUser(){
        Object ouser = session.getAttribute(CommonConstants.SESSION_USER);
        if(ouser!=null){
            return (SysUser)ouser;
        }else{
            return null;
        }
    }

//    @InitBinder
//    public void initDateBinder(WebDataBinder dataBinder) {
//        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
//        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
//    }

    @InitBinder
    protected void initDateBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new MyDateEditor());
        binder.registerCustomEditor(Double.class, new DoubleEditor());
        binder.registerCustomEditor(Integer.class, new IntegerEditor());
    }

    private class MyDateEditor extends PropertyEditorSupport {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = null;
            try {
                date = format.parse(text);
            } catch (ParseException e) {
                format = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    date = format.parse(text);
                } catch (ParseException e1) {
                }
            }
            setValue(date);
        }
    }

    public class DoubleEditor extends PropertiesEditor {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            if (text == null || text.equals("")) {
                text = "0";
            }
            setValue(Double.parseDouble(text));
        }

        @Override
        public String getAsText() {
            return getValue().toString();
        }
    }

    public class IntegerEditor extends PropertiesEditor {
        @Override
        public void setAsText(String text) throws IllegalArgumentException {
            if (text == null || text.equals("")) {
                text = "0";
            }
            setValue(Integer.parseInt(text));
        }

        @Override
        public String getAsText() {
            return getValue().toString();
        }
    }

}

