package com.ming.springboot;

import com.ming.springboot.po.Employee;
import com.ming.springboot.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/21 15:09
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private Employee employee;

//    @Test
//    public void loadsContext(){
//        UserService userService = (UserService) context.getBean("userService");
//        userService.queryUser();
//    }

    @Test
    public void testMyxmlFile(){
        UserService userService = (UserService) context.getBean("userServiceId");
        userService.queryUser();
    }

    @Test
    public void loadsContext2(){
        System.out.println(employee);
    }

    @Test
    public void testPath(){
        System.out.println(System.getProperty("user.dir"));
    }
}
