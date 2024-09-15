//
//Pseudocode for Checking Perfect Number
//
//FUNCTION isPerfectNumber(n):
//    IF n <= 1:
//        RETURN False
//    
//    sum_of_divisors = 0
//    
//    FOR i FROM 1 TO n/2:
//        IF n MOD i == 0:
//            sum_of_divisors = sum_of_divisors + i
//    
//    IF sum_of_divisors == n:
//        RETURN True
//    ELSE:
//        RETURN False
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//package Logic;
//
//public class Perfect_number {
//     
//	        
//	    // Creating check() method that will return true when number will be perfect   
//	    static boolean check(int number)   
//	    {   
//	        int sum = 1;   
//	    
//	        // Finding all the divisors   
//	        for (int j = 2; j * j <= number; j++)   
//	        {   
//	            if (number % j==0)   
//	            {   
//	                if(j * j != number)   
//	                    sum = sum + j + number / j;   
//	                else  
//	                    sum = sum + j;   
//	            }   
//	        }    
//	        // Checking whether the sum of the divisors and number both are equal or not  
//	        if (sum == number && number != 1)   
//	            return true;   
//	    
//	        return false;   
//	    }   
//	    
//	    // Main() method   
//	    public static void main (String[] args)   
//	    {   
//	        System.out.println("Perfect numbers between 0-1jXj000:");   
//	        for (int n = 2; n < 1000; n++){   
//	            if (check(n))   
//	                System.out.println( n +" is a perfect number");   
//	        }  
//	    }   
//	}  
// ===================================================================================
package Logic;
import java.util.Scanner;
public class Perfect_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Num");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<num/2;i++) { 
//this num/2 will divide the number by 2 because we have to check 1/2 of the
//number it will make code efficient
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("This Is The Perfect Number "+num);	
	    }  
		else {
			System.out.println("This Is Not A Perfect Number "+num);
		}
			
	}
}















