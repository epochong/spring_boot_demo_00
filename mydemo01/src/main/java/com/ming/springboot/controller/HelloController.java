package com.ming.springboot.controller;

import com.ming.springboot.po.People;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/21 14:59
 */


//springboot + mybatis
//springboot + jdbc
//Spring+Springboot(Controller+Service+xxxx)
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(name="/queryUser")
    public String queryUser(){
        return "hello spring boot";
    }


}
