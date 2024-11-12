package com.tutorialspoint.pt09;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class TestJunit {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Ignore
	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		message = "Robert";
		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
