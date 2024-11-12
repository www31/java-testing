package com.simplilearn.junit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitProject {
	@Test
	public void test_JUnit() {
		System.out.println("Let's check this string");
		String str1 = "Let's check this string1";
		assertEquals("Let's check this string", str1);
	}
}
