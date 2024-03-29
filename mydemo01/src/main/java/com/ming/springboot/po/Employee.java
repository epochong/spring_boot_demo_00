package com.ming.springboot.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/21 15:22
 */

@Component
@PropertySource(value = "classpath:employee.properties")
@ConfigurationProperties(prefix = "emp")
public class Employee {

    @Value("${emp.emp-name}")
    private String empName;

    @Value("#{20*10}")//spEL
    private int empAge;

    @Value("${emp.emp-type}")
    private boolean empType;

    private List list;

    private Map map;

    private People people;

    public Employee(){

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public boolean isEmpType() {
        return empType;
    }

    public void setEmpType(boolean empType) {
        this.empType = empType;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empType=" + empType +
                ", list=" + list +
                ", map=" + map +
                ", people=" + people +
                '}';
    }
}
