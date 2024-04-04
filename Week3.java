package com.example.week3;

public class Week3 {

	public static void main(String[] args) {
		// power of 5 raised to 3
		int base , exponent ;
		double result;
		
		base = 5;
		exponent = 3;
		result= Math.pow(base, exponent);
		System.out.println("Power of 5 raised to 3 is : " + result);
		
		
		//square root of 77
		double number = 77;
		double squareRoot= Math.sqrt(number);
		System.out.println("Square root of 77 is : " + squareRoot);
 
        //rounding 5.4 into 5.0 and 5.5 to 6.0
		double value = 5.4;
		double roundNumber =Math.round(value);
		System.out.println("Rounding 5.4 :" +roundNumber);
        
		double value1 = 5.5;
		double roundNumber1 =Math.round(value1);
		System.out.println("Rounding 5.5 :" +roundNumber1);
		
		//ceiling of 2.6
		double name= 2.6;
		double ceiling =Math.ceil(name);
		System.out.println( "ceiling of 2.6 is:"+ceiling);
		
		//Value of PI
		double pi = Math.PI;
		System.out.println("value of PI is :" + pi);
		
		//Program by
		System.out.println("Program done by : SHREYA ARYAL");
        
	}
}
