package Logic;
import java.util.Scanner;
public class Prime_number {

	static boolean IsPrime(int num) {
		if(num>1){
		   return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i==0) {
			return false;
			}
		}
	  return true;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Check:");
		int A=sc.nextInt();
//		for(int i=1;i<A;i++)
//		    IsPrime(i);
          boolean r=IsPrime(A);
		if(r==false)
			System.out.println("not Prime");
		else
			System.out.println("Prime");

		
		

	}

}
