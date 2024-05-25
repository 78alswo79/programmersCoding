package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding4 {
	public static void main(String[] args) {
//		[293, 1000, 395, 678, 94]		[94, 777, 104, 1000, 1, 12]		[293, 395, 678]
//		[110, 66, 439, 785, 1]			[377, 823, 119, 43]				[110, 66, 439, 785, 1]

		int[] arr = {110, 66, 439, 785, 1};
		int[] delete_list = {377, 823, 119, 43};
        int[] answer = {};
       
        int cnt = 0;
        List<Integer> intList = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = 0; j < delete_list.length; j++) {
        		if (arr[i] != delete_list[j])
        		{
        			cnt++;
        		}
        	}
        	
        	if (cnt == delete_list.length)
        	{
        		intList.add(arr[i]);
        	}
        	cnt = 0;
        }
        System.out.println(intList);
	}
}
