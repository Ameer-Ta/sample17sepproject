package com.ds.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ds.testbase.Testbase;

public class Listenerssetup extends Testbase implements  ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Test case execution started -"+result.getName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case execution success -"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case execution failure -"+result.getName());
		Utilclass.takeSS(result.getName()+"-"+System.currentTimeMillis());
		System.out.println("Take screenshot");
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case execution skipped -"+result.getName());
	}

}
