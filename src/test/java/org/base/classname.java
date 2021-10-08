package org.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class classname {
	@AfterClass
	public static void tc1() {
		System.out.println("@AfterClass");

	}
	@Test
	public  void tc2() {
		System.out.println("@Test");

	}
	@After
	public void tc3() {
		System.out.println("@After");

	}
}
