package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트 자르기
//		3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
//		4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
		int n = 1;
		int[] slicer = {1, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] answer = {};
        
        int stIdx = 0;
        int endIdx = 0;
        int add = 1;
        List<Integer> intList = new ArrayList<>();
        if (n == 1) {
        	stIdx = 0;
        	endIdx = slicer[1];
        } else if (n == 2) {
        	stIdx = slicer[0];
        	endIdx = num_list.length - 1;
        } else if (n == 3) {
        	stIdx = slicer[0];
        	endIdx = slicer[1];
        } else {
        	stIdx = slicer[0];
        	endIdx = slicer[1];
        	add = slicer[2];
        }
        
        for (int i = stIdx; i <= endIdx; i = i + add) {
        	intList.add(num_list[i]);
        }
        answer = intList.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(answer));
	}

}
