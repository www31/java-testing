package com.tutorialspoint.pt11;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test(timeout = 1000)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}

	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
