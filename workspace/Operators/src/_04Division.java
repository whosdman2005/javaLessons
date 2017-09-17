/**
 * 
 * Class to show examples of Division
 * 
 * @author G74S
 *
 */
public class _04Division {
	public static void main(String [] args) {
		int i1 = 12;
		int i2 = 5;
		float f1 = 5.0f;
		double d1 = 5.0;
		
//		int res1 = i1 / i2;
//		float res2 = i1 / f1;
//		double res3 = i1 / d1;
		
		
		int res1 = i1 % i2;
		float res2 = i1 % f1;
		double res3 = i1 % d1;
		
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
		System.out.println("res3 = " + res3);
		
		
		/*
		 Output from the division
		  res1 = 2
		  res2 = 2.4
		  res3 = 2.4
		 */
		
		/*
		 Output from the modulus expression 
		  res1 = 2
		  res2 = 2.0
		  res3 = 2.0
   	    */
		
		
		
	}
	
	
	
	
}
