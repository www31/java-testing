package com.tutorialspoint.pt13;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void maifn(String[] args) {
		Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
