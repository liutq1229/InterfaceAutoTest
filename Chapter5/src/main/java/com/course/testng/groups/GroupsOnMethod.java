package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端的测试方法1111执行了");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端的测试方法2222执行了");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端的测试方法3333执行了");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端的测试方法4444执行了");
    }

    @BeforeGroups("server")
    public void beforeGroup1(){
        System.out.println("这是服务端组运行前执行的");
    }

    @AfterGroups("server")
    public void afterGroup1(){
        System.out.println("这是服务端组运行后执行的");
    }

    @BeforeGroups("client")
    public void beforeGroup2(){
        System.out.println("这是客户端组运行前执行的");
    }

    @AfterGroups("client")
    public void afterGroup2(){
        System.out.println("这是客户端组运行后执行的");
    }
}
