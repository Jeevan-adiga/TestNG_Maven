package com.example.utils;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListner extends TestListenerAdapter {

	@Override
	public void onTestFailure(ITestResult tr) {
		Log.info(tr.getName() + "--Test method failed");
		System.out.println(tr.getName() + "--Test method failed");
		System.out.println("Assert Msg"+tr.getThrowable().getMessage());
		Log.info("Assert Msg :"+tr.getThrowable().getMessage());
		System.out.println(tr.getThrowable().fillInStackTrace());
		//System.out.println(tr.getThrowable().getStackTrace());
//		Log.info(tr.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		Log.info(tr.getName() + "--Test method skipped");
		System.out.println(tr.getName() + "--Test method skipped");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		Log.info(tr.getName() + "--Test method success");
		System.out.println(tr.getName() + "--Test method success");
	}

}
