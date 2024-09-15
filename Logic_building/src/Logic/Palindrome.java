//FUNCTION isPalindrome(num)
//    SET temp TO num
//    SET rev TO 0
//
//    WHILE num is not equal to 0
//        SET rev TO (rev * 10) + (num % 10)
//        SET num TO num / 10
//    END WHILE
//
//    IF rev is equal to temp
//        RETURN true
//    ELSE
//        RETURN false
//END FUNCTION
//
//START main
//    CREATE a Scanner object sc
//    PRINT "Enter The Number"
//    READ num from user input
//
//    SET A TO isPalindrome(num)
//
//    IF A is true
//        PRINT "Palindrome " + num
//    ELSE
//        PRINT "Not Palindrome " + num
//END main

// rev=(rev*10)+digit
// rev=(rev*10)+(num%10)



package Logic;
import java.util.Scanner;
public class Palindrome {
	static void isPalindrome(int num) {
		
		int temp, rev=0;
		temp=num;
		while(num!=0) {
		rev=(rev*10)+(num%10);
		num=num/10;
		}
		if(rev==temp) 
			System.out.println("Palindrome "+temp);		
		else
			System.out.println(" Not A Palindrome "+temp);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		isPalindrome(num);
//		boolean A=isPalindrome(num);
//		if(A)
//			System.out.println("Palindrome "+num);
//		else
//			System.out.println("Not Palindrome"+num);
	} 

}
