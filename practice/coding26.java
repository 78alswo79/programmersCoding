package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그림확대
//		[".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."]	2	["..xxxx......xxxx..", "..xxxx......xxxx..", "xx....xx..xx....xx", "xx....xx..xx....xx", "xx......xx......xx", "xx......xx......xx", "..xx..........xx..", "..xx..........xx..", "....xx......xx....", "....xx......xx....", "......xx..xx......", "......xx..xx......", "........xx........", "........xx........"]
//		["x.x", ".x.", "x.x"]																		3	["xxx...xxx", "xxx...xxx", "xxx...xxx", "...xxx...", "...xxx...", "...xxx...", "xxx...xxx", "xxx...xxx", "xxx...xxx"]
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k = 2;
        String[] answer = {};
        
        int rowLeng = picture.length * k;
        int colLeng = picture[0].length() * k;
        answer = new String[rowLeng];
        
        // 9번
        for (int i = 0; i < rowLeng; i++) {
        	// 0 0 0 1 1 1 2 2 2 
        	int row = i / k ;
        	StringBuilder sb = new StringBuilder();
        	for (int j = 0; j < colLeng; j++) {
        		// 0 0 0 1 1 1 2 2 2
        		int col = j / k;
        		sb.append(picture[row].charAt(col));
        	}
        	answer[i] = sb.toString();
        }
        System.out.println(Arrays.toString(answer));
	}
}
