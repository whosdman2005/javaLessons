/**
 * This provides various utility methods for Strings
 * 
 * @author javaman
 * @author example of the new guy
 * @version 1.0.1
 */
public class ModifiedStringUtils {
	
	/**
	 * 
	 * Accepts a String and returns its reverse
	 * If you pass "javaman". this method return namavaja
	 * 
	 * @param str Original String
	 * @return reverse of Original String
	 * 
	 */
		public static String reverse(String str) {
			/**
			 * 
			 * Reversing the String using StringBuilder
			 * 
			 */
			String rev = "";
			StringBuilder sb = new StringBuilder(str);
			rev = sb.reverse().toString();
			return rev;
			
			
			
		}
		

}
