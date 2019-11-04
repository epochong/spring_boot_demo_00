package com.ming.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/21 15:01
 */


/**
 * @SpringBootConfiguration
 *     @Configuration : 证明这是一个配置文件
 *
 * @EnableAutoConfiguration
 *      @AutoConfigurationPackage : 默认扫描springboot启动器所在的包下的所有的子包
 *      @Import({AutoConfigurationImportSelector.class}) : 自动帮你导入需要的jar包和相关的属性文件
 * @ComponentScan ：如果该组件不是controller service repository,则用component来标识,这样springboot就你能够识别
 */

/**
 * @ImportResource : 在springboot中导入xml文件,但是前提是一定要加入classpath
 *
 * @PropertiesSource: 加入属性值的
 */
@ImportResource(locations="classpath:applicationContext-service.xml")
@SpringBootApplication
public class MyBoot {

    public static void main(String[] args) {
        SpringApplication.run(MyBoot.class,args);
    }
}
