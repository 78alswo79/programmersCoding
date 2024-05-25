package practice;

import java.util.Arrays;

public class coding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[49, 12, 100, 276, 33]		27		[76, 12, 127, 276, 60]
//		[444, 555, 666, 777]		100		[444, 655, 666, 877]
		
		// 내 방식.
		int[] arr = {444, 555, 666, 777};
		int n = 100;
        int[] answer = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr.length % 2 != 0)
        	{
        		if (i % 2 == 0)
        		{        			
        			answer[i] = arr[i] + n;
        		}
        		else
        		{
        			answer[i] = arr[i];
        		}
        	}
        	else 
        	{
        		if (i % 2 != 0)
        		{        			
        			answer[i] = arr[i] + n;
        		}
        		else
        		{
        			answer[i] = arr[i];
        		}
        	}
        }
        
        System.out.println(Arrays.toString(answer));
        
        
		// 다른 사람의 풀이
        int[] arr = {49, 12, 100, 276, 33};
		int n = 27;
        int[] answer = new int[arr.length];
        
        int staIdx = arr.length % 2 == 0 ? 1 : 0;
        
        
        for (int i = staIdx; i < arr.length; i += 2) {
        	arr[i] = arr[i] + n;
        }
        System.out.println(Arrays.toString(arr));
	}

}
