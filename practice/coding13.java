package practice;

import java.util.Arrays;

public class coding13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[0, 1, 2, 3, 4]		[[0, 1],[1, 2],[2, 3]]		[1, 3, 4, 4, 4]
		// 수열과 구간 쿼리1
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1},{1, 2},{2, 3}};
        int[] answer = {};
        
        int strIdx = 0;
        int endIdx = 0;
        for (int i = 0; i < queries.length; i++) {
        	for (int j = 0; j < queries[i].length; j++) {
        		strIdx = queries[i][j];
        		endIdx = queries[i][j + 1];
        		break;
        	}
        	
        	for (int j = 0; j < arr.length; j++) {
        		if (strIdx <= j && endIdx >= j) {
        			arr[j]++; 
        		}
        	}
        }
        System.out.println(Arrays.toString(arr));
	}

}
