/**
 *   File Name: ReverseString.java<br>
 *
 *   Yutaka<br>
 *   Created: Jul 8, 2017
 *   
 */

package org.programmr.coding;

/**
 * ReverseString //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class ReverseString {
	
	/**
	 * using StringBuffer and it's function reverse()
	 * @param str
	 * @return
	 */
	public String reverseString01(String str) {
		String result;
		StringBuffer sb = new StringBuffer(str);
		return result = sb.reverse().toString();
	}
	
	public String reverseString02(String str) {
		String result = "";
		String original = str;
		for (int i = original.length()-1; i >= 0; i--) {
			result = result + original.charAt(i);
		}
		return result;
	}

}
