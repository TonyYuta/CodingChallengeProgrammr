package org.programmr.coding;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReverseStringTest {
	
	ReverseString rs;
	String original;
	String reverse;

	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		rs = new ReverseString();
		original = "abcdef";
		reverse = "fedcba";
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
	}
		
	@Test(enabled = true, groups = {"reverse", "string", "regression", "all"}, dependsOnGroups = {"palindrome"}, priority = 0)
	public void reverseString01Test() {
		Assert.assertEquals(reverse, rs.reverseString01(original), "Reverse string doesn't match to expected");
	}
	
	
	
}
