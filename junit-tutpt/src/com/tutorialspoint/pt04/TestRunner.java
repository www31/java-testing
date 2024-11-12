package com.tutorialspoint.pt04;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.tutorialspoint.pt05.JunitAnnotation;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestEmployeeDetails.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
