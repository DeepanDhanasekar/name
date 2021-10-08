package org.base;





import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {
	

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
	

	
	@BeforeClass
	public static void tc4() {
		System.out.println("@BeforeClass");

	}
	@Test
	public void tc5() {
		System.out.println("@Test");
	}
@Before
public void tc6() {
System.out.println("@Before");

}

}
