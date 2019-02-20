package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider="data")
    public void testDataProvider(String name,int age){

        System.out.println("name="+name+"; age="+age);

    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o =new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}

        };

        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("方法1111执行了，name="+name+"; age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("方法2222执行了，name="+name+"; age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] dataProvider(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{
                    {"zhangsan",20},
                    {"lisi",30}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"zhangsan",50},
                    {"lisi",60}
            };
        }
        return result;
    }
}
