package org.programmr.coding;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 */
public class PalindromeTest {
	IsPalindromeString ips;
	String palindromeString;		
	String notPalindromeString;
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		ips = new IsPalindromeString();
		palindromeString = "abcdcba";		
		notPalindromeString = "abcdefg";
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {	
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "regression", "all"}, priority = 0)
	public void IsPalindromeString01TrueTest() {
		Assert.assertTrue(ips.isPalindromeString01(palindromeString), "Wrong result: String " + palindromeString + "considered as not a palindrome");		
	}
	
	@Test(enabled = true, groups = {"palindrome", "string", "regression", "all"}, priority = 0)
	public void IsPalindromeString01FalseTest() {
		Assert.assertFalse(ips.isPalindromeString01(notPalindromeString), "Wrong result: String " + notPalindromeString + "considered as a palindrome");		
	}
	
	//@Test(enabled = true, groups = {"palindrome", "regression", "all"}, dependsOnGroups = {"string"}, priority = 1)
	@Test(enabled = true, groups = {"palindrome", "stringbuffer", "regression", "all"}, priority = 1)
	public void IsPalindromeString02TrueTest() {
		Assert.assertTrue(ips.isPalindromeString02(palindromeString));
	}
	
	//@Test(enabled = true, groups = {"palindrome", "regression", "all"}, dependsOnGroups = {"string"} , priority = 1)
	@Test(enabled = true, groups = {"palindrome", "stringbuffer", "regression", "all"}, priority = 1)
	public void IsPalindromeString02FalseTest() {
		Assert.assertFalse(ips.isPalindromeString02(notPalindromeString));
	}
	
	@Test(enabled = true, groups = {"palindrome", "regression", "all"}, dependsOnGroups = {"stringbuffer"}, priority = 2)
	public void IsPalindromeString03TrueTest() {
		Assert.assertTrue(ips.isPalindromeString03(palindromeString), "Wrong result: String " + palindromeString + "considered as not a palindrome");		
	}
	
	@Test(enabled = true, groups = {"palindrome", "regression", "all"}, priority = 2)
	public void IsPalindromeString03FalseTest() {
		Assert.assertFalse(ips.isPalindromeString03(notPalindromeString),  "Wrong result: String " + notPalindromeString + "considered as a palindrome");		
	}
	
	
}
