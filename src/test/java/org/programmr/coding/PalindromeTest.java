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
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		ips = new IsPalindromeString();
	}
	
	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		
	}
	
	@Test(enabled = true, groups = {"palindrome", "regression", "all"}, priority = 0)
	public void IsPalindromeStringReverseTrueTest() {
		String palindromeString = "abcdcba";		
		Assert.assertTrue(ips.isPalindromeStringReverse(palindromeString), "Wrong result: String " + palindromeString + "considered as not a palindrome");		
	}
	
	@Test(enabled = true, groups = {"palindrome", "regression", "all"})
	public void IsPalindromeStringReverseFalseTest() {
		String notPalindromeString = "abcdefg";
		Assert.assertFalse(ips.isPalindromeStringReverse(notPalindromeString), "Wrong result: String " + notPalindromeString + "considered as a palindrome");		
	}
	
	@Test(enabled = true, groups = {"palindrome", "regression", "all"}, priority = 1)
	public void IsPalindromeStringHalfTrueTest() {
		String palindromeString = "abcdcba";		
		Assert.assertTrue(ips.isPalindromeStringHalf(palindromeString), "Wrong result: String " + palindromeString + "considered as not a palindrome");		
	}
	
	@Test(enabled = true, groups = {"palindrome", "regression", "all"}, priority = 1)
	public void IsPalindromeStringHalfFalseTest() {
		String notPalindromeString = "abcdefg";
		Assert.assertFalse(ips.isPalindromeStringHalf(notPalindromeString),  "Wrong result: String " + notPalindromeString + "considered as a palindrome");		
	}
	
	
}
