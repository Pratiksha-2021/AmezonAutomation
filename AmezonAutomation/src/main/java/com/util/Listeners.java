package com.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import com.base.TestBase;
public class Listeners extends TestBase implements ITestListener ,IRetryAnalyzer,IAnnotationTransformer{
	
 public static	Logger lg=Logger.getLogger(Listeners.class);


	public void onFinish(ITestContext context) {
		lg.info("test  is in >>onStart");
		
	}

	
	public void onStart(ITestContext context) {
		lg.info("test  is in >>onStart");
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		lg.info("test  is in >>onTestFailedButWithinSuccessPercentage ");
		
	}

	
	public void onTestFailure(ITestResult result) {
		lg.error("test  is in >>onTestFailure ");
		try {
			TestUtil.failed1(driver,result.getName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}

	
	public void onTestSkipped(ITestResult result) {
		lg.warn("Test case >>Getting Skip");
		try {
			TestUtil.failed1(driver,result.getName());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		}


	public void onTestStart(ITestResult result) {
		lg.info("Test case>>on Start");
		
	}


	public void onTestSuccess(ITestResult result) {
		lg.info("Test case pass>>successfully");
		
	}

 public boolean retry(ITestResult result){
		int counter=0;
		int limit=3;
	    if(counter<limit){
	    	counter++;
	    	return true;
	    	}
	    	else{
	    		return false;
	    	}
	    
 }
	    
	    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
			annotation.setRetryAnalyzer(Listeners.class);
	    }

 }


