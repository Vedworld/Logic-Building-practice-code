/*range of Tables*/

//package Logic;
//import java.util.Scanner;
//public class Tables {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The number :");
//		int num = sc.nextInt();
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=10;j++) {
//			
//				System.out.println(i+"*"+j+"="+j*i);
//					
//			}
//			System.out.println();
//		}
//
//	}
//
//}
//===============================================================================
/*single table*/

package Logic;
import java.util.Scanner;

public class Tables {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number :");
        int num = sc.nextInt();
        
        // Single loop to print the table of 'num'
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + (num * i));
        }
    }
}
 
//start 
//get num form terminal
//for loop(int i = 1; i grater then euqal to 10; post Increment of i)
//   print (num*i)
//for loop end
