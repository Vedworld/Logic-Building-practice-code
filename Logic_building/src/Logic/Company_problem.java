package Logic;
//import java.util.Scanner;
//public class Company_problem {
//	
//	    public static void main(String[] args) {
//	    	Scanner sc=new Scanner(System.in);
//	    	System.out.println("Enter the Array");
//	        char[] Arr1 = {'A', 'B', 'C', 'D', 'E', 'F'};
//	        int[] Arr2 = {1, 2, 3, 4};
//	        
//	        int len1 = Arr1.length;
//	        int len2 = Arr2.length;
//	        
//	        // We need to print 2 elements from Arr1 and 2 elements from Arr2 alternately
//	        for (int i = 0, j = 0; i < len1 || j < len2;) {
//	            // Print two elements from Arr1 if available
//	            if (i < len1) {
//	                System.out.print(Arr1[i++]);
//	            }
//	            if (i < len1) {
//	                System.out.print(Arr1[i++]);
//	            }
//	            
//	            // Print two elements from Arr2 if available
//	            if (j < len2) {
//	                System.out.print(Arr2[j++]);
//	            }
//	            if (j < len2) {
//	                System.out.print(Arr2[j++]);
//	            }
//	        }
//	    }
//	}

public class Company_problem {
	
	    public static void main(String[] args) {
	        char[] Arr1 = {'A', 'B', 'C', 'D', 'E', 'F'}; // Array of characters
	        char[] Arr2 = {'1', '2', '3', '4'};           // Array of numbers as characters

	        // Result array to hold the combined elements
	        char[] S1 = new char[Arr1.length + Arr2.length];

	        int i = 0, j = 0, k = 0;

	        // Use a single loop to alternate adding 2 elements from Arr1 and 2 elements from Arr2
	        while (i < Arr1.length || j < Arr2.length) {
	            // Add two elements from Arr1, if available
	            if (i < Arr1.length) S1[k++] = Arr1[i++];
	            if (i < Arr1.length) S1[k++] = Arr1[i++];

	            // Add two elements from Arr2, if available
	            if (j < Arr2.length) S1[k++] = Arr2[j++];
	            if (j < Arr2.length) S1[k++] = Arr2[j++];
	        }

	        // Print the combined array
	        System.out.println(S1);
	    }
	}
