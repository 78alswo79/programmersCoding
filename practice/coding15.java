package practice;

import java.util.Arrays;

public class coding15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수열과 구간쿼리3
//		[0, 1, 2, 3, 4]	 [[0, 3],[1, 2],[1, 4]]	 [3, 4, 1, 0, 2]
		int[] arr = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 3},{1, 2},{1, 4}};
        int[] answer = {};
        
        int strIdx = 0;
        int endIdx = 0;
        int temp = 0;
        for (int i = 0; i < queries.length; i++) {
        	for (int j = 0; j < queries[i].length; j++) {
        		strIdx = queries[i][j];
        		endIdx = queries[i][j + 1];
        		break;
        	}
    		temp = arr[strIdx];
    		arr[strIdx] = arr[endIdx];
    		arr[endIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
	}

}
