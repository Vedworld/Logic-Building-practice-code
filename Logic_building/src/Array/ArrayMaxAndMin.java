package Array;

public class ArrayMaxAndMin {
  
	public static void main(String[] args) {
		
		        int[] arr = {3, 5, 7, 2, 8};
		        int min = arr[0], max = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) 
		            	min = arr[i];
		            if (arr[i] > max) 
		            	max = arr[i];
		        }
		        System.out.println("Minimum: " + min);
		        System.out.println("Maximum: " + max);
	}
}


//start 
//set integer array= {3,5,7,2,8}
//set max=index[0]
//set min=index[0]
//		for loop(int i = 1; i < arr.length; i++)
//		 	if (arr[i] < min) 
//		 		min = arr[i];
//			if (arr[i] > max) 
//				max = arr[i];
//        for loop end 
//        print(min)
//        print(max)
//end
