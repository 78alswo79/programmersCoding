package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding8 {

	public static void main(String[] args) {
		//	[1, 2, 3, 4, 5]		[{1, 3}, {0, 4}]	[2, 3, 4, 1, 2, 3, 4, 5]
		int[] arr = {1, 2, 3, 4, 5};
		int[][] intervals = {{1, 3}, {0, 4}};
        int[] answer = {};
        
        int stIdx = 0;
        int edIdx = 0;
        List<Integer> intList = new ArrayList<Integer>();
        
        for (int i = 0; i < intervals.length; i++) {
        	for (int j = 0; j < intervals[i].length; j++) {
        		stIdx = intervals[i][j];
        		edIdx = intervals[i][j + 1];
        		break;
        	}
        	
        	for (int c = 0; c < arr.length; c++) {
        		if (c >= stIdx && c <= edIdx) 
        		{
        			intList.add(arr[c]);
        		}
        	}
        }
        
        answer = intList.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
	}
}
