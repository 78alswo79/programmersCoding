package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 만들기2
//		5	555		[5, 50, 55, 500, 505, 550, 555]
//		10	20		[-1]
		int l = 10;
		int r = 20;
        int[] answer = {};
        
        String[] strArr = {};
        String intToStr = "";
        List<Integer> intList = new ArrayList<>();
        for (int i = l; i <= r; i++ ) {
        	if (i % 5 == 0) {
        		intToStr = i + "";
            	strArr = intToStr.split("");
            	// ex) 5
            	// ex) 1,0
            	// ex) 5,5
            	// 5와 0으로 이루어져 있는지 채크하는 변수.
            	int cnt = 0;
            	for (int j = 0; j < strArr.length; j++) {
            		if (strArr[j].equals("0") || strArr[j].equals("5")) {
        				cnt++;
            		}
            	}
            	// 5와 0으로 이루어져 있으면, 값 담기.
            	if (cnt == strArr.length) {
            		intList.add(i);
            	}
        	}
        }
        if (intList.isEmpty()) intList.add(-1);
        
        answer = intList.stream().mapToInt(i -> i).toArray();
    	System.out.println(Arrays.toString(answer));
	}

}
