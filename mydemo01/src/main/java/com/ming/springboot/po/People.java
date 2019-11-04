package com.ming.springboot.po;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/21 15:23
 */
public class People {

    private String pName;

    private int pAge;

    public People(){

    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpAge() {
        return pAge;
    }

    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    @Override
    public String toString() {
        return "People{" +
                "pName='" + pName + '\'' +
                ", pAge=" + pAge +
                '}';
    }
}
