package practice;

import java.util.Arrays;

public class coding23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 무작위로 K개의 수 뽑기
//		[0, 1, 1, 2, 2, 3]	3	[0, 1, 2]
//		[0, 1, 1, 1, 1]		4	[0, 1, -1, -1]
		int[] arr = {0, 1, 1, 1, 1};
		int k = 4;
        int[] answer = new int[k];
        
        arr = Arrays.stream(arr).distinct().toArray();
        
        if (arr.length >= answer.length) {
        	for (int i = 0; i < answer.length; i++) {
            	answer[i] = arr[i];
            }
		} else if (arr.length < k) {
        	for (int i = 0; i < answer.length; i++) {
        		if (arr.length <= i) {
        			answer[i] = -1;
        		} else {
        			answer[i] = arr[i];
        		}
            }
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
