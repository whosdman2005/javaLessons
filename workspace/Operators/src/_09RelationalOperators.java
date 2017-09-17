/**
 * 
 * Class to show examples of Relational operators
 * char range 0 to 65535
 * @author G74S
 *
 */
public class _09RelationalOperators {
	public static void main(String [] args) {
		byte b1 = 5;
		short s1 = 5;
		int i1 = 5;
		int i2 = 10;
		long l1 = 5;
		float f1 = (float) 5.0;
		double d1 = 5.0;
		char c1 = 5;
		
		
		System.out.println("b1 == s1 : " + (b1 == s1)); // 5 == 5 >>> True
		System.out.println("i1 == l1 : " + (i1 == l1)); // 5 == 5 >>> True
		System.out.println("i1 == f1 : " + (i1 == f1)); // 5 == 5.0 >>> True
		System.out.println("i1 == d1 : " + (i1 == d1)); // 5 == 5.0 >>> True
		System.out.println("f1 == d1 : " + (f1 == d1)); // 5.0 == 5.0 >>> True
		System.out.println("i1 == c1 : " + (i1 == c1)); // 5 == 5 >>> True
		
		System.out.println("i1 == i2 : " + (i1 == i2)); // 5 == 10 >>> False
		System.out.println("i1 != i2 : " + (i1 != i2)); // 5 != 10 >>> True
		System.out.println("i1 >= i2 : " + (i1 >= i2)); // 5 >= 10 >>> False
		System.out.println("i1 <= i2 : " + (i1 <= i2)); // 5 <= 10 >>> True
		
		/*
		 Output
		  b1 == s1 : true
		  i1 == l1 : true
 		  i1 == f1 : true
		  i1 == d1 : true
		  f1 == d1 : true
		  i1 == c1 : true
		  i1 == i2 : false
		  i1 != i2 : true
		  i1 >= i2 : false
		  i1 <= i2 : true
		  
		 */
		
	}
	
	
	
	
}
