package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2의 영역
//		[1, 2, 1, 4, 5, 2, 9]		[2, 1, 4, 5, 2]
//		[1, 2, 1]					[2]
//		[1, 1, 1]					[-1]
//		[1, 2, 1, 2, 1, 10, 2, 1]	[2, 1, 2, 1, 10, 2]
		
		int[] arr = {1, 1, 1};
        int[] answer = {};
        
        
        List<Integer> intList = new ArrayList<Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == 2) {
        		intList.add(i);
        	}
        }
        
        if (intList.isEmpty()) {
        	resList.add(-1);
        } else {
        	for (int i = intList.get(0); i <= intList.get(intList.size() - 1); i++) {
        		System.out.println(arr[i]);
        		resList.add(arr[i]);
        	}
        }
        answer = resList.stream().mapToInt(i -> i).toArray();
        
        
	}

}
