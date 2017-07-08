/*
 * Write a program which takes input as string and check it is palindrom or not. 
 * If the string and the reverse of string are same then we say string is palindrom. 
 * Example : 1.If string is "level" then the output should be: palindrome 
 * 2.If string is "helloworld" then the output should be: not a palindrome 
 * */

package org.programmr.coding;

public class IsPalindromeString {
	
	  public boolean isPalindromeString01(String str) {
      String original = str;
      String reverse = "";
      boolean result;
   //   Scanner in = new Scanner(System.in); 
   //   System.out.println("Enter a string to check if it is a palindrome");
   //   original = in.nextLine();
      int length = original.length();
 
      for (int i = length-1; i >= 0; i--)
         reverse = reverse + original.charAt(i);

      return result = original.equals(reverse);
	  }
	  
	  public boolean isPalindromeString02(String str) {
		  String original = str;
		  boolean result;
		//  Scanner in = new Scanner(System.in);
		//  System.out.println("Enter a string to check if it is a palindrome");
		//  original = in.nextLine();
		  StringBuffer reverse = new StringBuffer(original).reverse();
		  
		  return result = original.equals(reverse.toString());
	  }
	  
	  public boolean isPalindromeString03(String str) {
		  String input = str;
		 // Scanner scanner = new Scanner(System.in);
		 // input = scanner.nextLine();
		  int length = input.length();
		  int i;
		  int begin = 0;
		  int end = length - 1;
		  int middle = (begin + end) / 2;
		  
		  for (i = begin; i <= middle; i++) {
			  if (input.charAt(begin) == input.charAt(end)) {
				  begin++;
				  end--;
			  }
			  else {
				  break;
			  }
		  }
		  
		  return (i == middle + 1);
	  }
	  
}