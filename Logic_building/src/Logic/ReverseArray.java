package Logic;
import java.util.Scanner;

public class ReverseArray {

	    public static void main(String[] args) {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("Enter Your Position From Where Do You Wanted To Reverse ");
	    	
	        int[] arr = {1, 2, 3, 4, 5};
	        int Position = sc.nextInt();
	        int end = arr.length - 1;

	        while (Position < end) {
	            int temp = arr[Position];
	            arr[Position] = arr[end];
	            arr[end] = temp;
	            Position++;
	            end--;
	        }
// for each loop
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }
	}
//how this works 
//12345  :in put  
//52341
//54321  :Out put
 
//from spacific position we need
//start  
//Set the Array arr[] ={1,2,3,4,5}
// get the Element from the terminal  using Scanner class
//and End =(length of arr -1)
//While (Position<end) swap
// and position++ , end--
// while loop end
//