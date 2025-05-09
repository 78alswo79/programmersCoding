package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding9 {
	public static void main(String[] args) {
	
//		[3, 2, 4, 1, 3]		[true, false, true, false, false]		[3, 3, 3, 3, 4, 4, 4, 4]
		int[] arr = {3, 2, 4, 1, 3};
		boolean[] flag = {true, false, true, false, false};
        int[] answer = {};
        
        List<Integer> intList = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
        	if (flag[i])
        	{
        		for (int j = 0; j < arr[i] * 2; j++) {
        			intList.add(arr[i]);
        		}
        	}
        	else
        	{
        		for (int j = 0; j < arr[i]; j++) {
        			intList.remove(intList.size() - 1);
        		}
        	}
        }
        
        answer = intList.stream().mapToInt(i -> i).toArray();
        
        System.out.println(Arrays.toString(answer));
	}
}
