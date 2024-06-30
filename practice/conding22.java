package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class conding22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수열과 구간쿼리 2
//		[0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]	[3, 4, -1]
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        int[] answer = new int[queries.length];
        
        int stIdx = 0;
        int endIdx = 0;
        int equlasInt = 0;
        List<Integer> minList = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
        	for (int j = 0; j < queries[i].length; j++) {
        		stIdx = queries[i][j];
        		endIdx = queries[i][j + 1];
        		equlasInt = queries[i][j + 2];
        		break;
        	}
        	
        	for (int k = stIdx; k <= endIdx; k++) {
        		if (arr[k] > equlasInt) {
        			minList.add(arr[k]);
                    int minNum = Collections.min(minList);
                    answer[i] = minNum;
        		}
        	}
        	minList.clear();
        	
        	if (answer[i] == 0) {
        		answer[i] = -1;
        	}
        }
        System.out.println(Arrays.toString(answer));
	}

}
