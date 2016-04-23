package com.example.testCases;


import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import com.example.utils.Log;

public class LoggingTest {
   // private Logger logger = Logger.getLogger(LoggingTest.class);

    @BeforeClass
    public void init() {
        //System.out.println(System.getProperty("outputdir"));
    }

    @Test (invocationCount=100, threadPoolSize=5)
    public void testFoo() throws InterruptedException {
    	Thread.sleep(2000);
        Log.info("logging from thread " + Thread.currentThread().getId());
//        System.out.println("logging from thread " + Thread.currentThread().getId());
    }
}
