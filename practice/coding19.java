package practice;

import java.util.Arrays;

public class coding19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건에 맞게 수열 변환하기 2
		// [1, 2, 3, 100, 99, 98]		5
		int[] arr = {1, 2, 3, 100, 99, 98};
	    int cnt = 0;
	    
	    int[] copyArr = arr.clone();
//	    50보다 크거나 같은 짝수라면 2로 나누고, 
//	    50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
	    
	    boolean loop = true;
	    while (loop) {
	    	for (int i = 0; i < arr.length; i++) {
		    	if (arr[i] >= 50 && arr[i] % 2 == 0) {
		    		arr[i] = arr[i] / 2;
		    	} else if (arr[i] < 50 && arr[i] % 2 != 0) {
		    		arr[i] = arr[i] * 2 + 1;
		    	}
		    }
	    	if (Arrays.equals(copyArr, arr)) loop = false;
	    	else {
	    		loop = true;
	    		copyArr = arr.clone();
	    	}
	    	cnt++;
	    }
	    System.out.println(Arrays.toString(arr));
	    System.out.println(cnt - 1);
	    cnt = cnt - 1;
	    
	}

}
