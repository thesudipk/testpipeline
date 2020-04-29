package com.test.pipeline;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test1 {
	@BeforeClass
	public static void setup() {
		System.out.println("before class");
	}

	@Before
	public void setupThis() {
		System.out.println("before");
	}

	@Test
	public void method() {
		org.junit.Assert.assertTrue(new ArrayList().isEmpty());
	}

	@After
	public void tearThis() {
		System.out.println("after");
	}

	@AfterClass
	public static void tear() {
		System.out.println("before class");
	}

}
