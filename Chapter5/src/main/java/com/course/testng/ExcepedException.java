package com.course.testng;

import org.testng.annotations.Test;

public class ExcepedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个异常测试");
        throw new RuntimeException();
    }
}
