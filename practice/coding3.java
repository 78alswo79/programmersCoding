package practice;

public class coding3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[49, 13]			[70, 11, 2]			-1
//		[100, 17, 84, 1]	[55, 12, 65, 36]	1
//		[1, 2, 3, 4, 5]		[3, 3, 3, 3, 3]		0
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 3, 3, 3, 3};
        int answer = 0;
        
        int sum1 = 0;
        int sum2 = 0;
        
        if (arr1.length == arr2.length)
        {
        	for (int item : arr1) {
        		sum1 = sum1 + item;
        		sum2 = sum2 + item;
        	}
        	answer = sum1 < sum2 ? 
        					-1 : sum1 > sum2 ?
        							1 : 0;
        }
        else
        {
        	answer = arr1.length < arr2.length ? 
        							-1 : arr1.length > arr2.length ?
												1 : 0;
        }
    	
        System.out.println(answer);
	}
}
