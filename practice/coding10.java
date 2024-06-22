package practice;

import java.util.Arrays;

public class coding10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 글자지우기
		// "apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmers"
		
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        String answer = "";
        
        String[] strArr = my_string.split("");
        
        for (int i = 0; i < indices.length; i++) {
        	System.out.print(my_string.substring(indices[i], indices[i] + 1) + " ");
        	strArr[indices[i]] = "";
        }

        	
        for (int i = 0; i < strArr.length; i++) {
        	answer += strArr[i];
        }

        
	}

}
