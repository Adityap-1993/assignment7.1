package assignment7_1;       //package declaration 

import java.util.*;          //importing scanner 

public class Conversion {                 //class definition 

	public static void main(String[] args) {       //main starts here 
		
		Scanner scan=new Scanner(System.in);      //declaring scanner object 
		
		System.out.println("Enter the integer to be converted to string : ");      //displaying message 
		
		int a=scan.nextInt();                                                      //taking user input 
		
		String s1="The number which is converted to string is : " ;               //string one 
		
		String s2= String.valueOf(a);                                             //converting integer value to string by inbuilt string function 
		                       
		
		System.out.println("Final ouput is :- ");
		
		System.out.println(s1+s2);                               //concatenating two strings and displaying  
		

	}

}//class ends here
