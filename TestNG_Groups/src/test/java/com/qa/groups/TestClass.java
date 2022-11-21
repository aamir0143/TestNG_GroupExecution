package com.qa.groups;

import org.testng.annotations.Test;

public class TestClass {

	@Test(groups= {"sanity"})
	public void Test01() {
		System.out.println("I am in Test 01");
	}

	@Test(groups= {"smoke"})
	public void Test02() {
		System.out.println("I am in Test 02");
	}

	@Test(groups= {"sanity","smoke"})
	public void Test03() {
		System.out.println("I am in Test 03");
	}

	@Test(groups= {"smoke"})
	public void Test04() {
		System.out.println("I am in Test 04");
	}

	@Test
	public void Test05() {
		System.out.println("I am in Test 05");
	}
}
