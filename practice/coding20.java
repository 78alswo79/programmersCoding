package practice;

import java.util.Arrays;

public class coding20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 왼쪽 오른쪽
//		["u", "u", "l", "r"]	["u", "u"]
//		["l"]					[]
		
		String[] str_list = {"u", "u", "l", "r"};
        String[] answer = {};
        
        // left = true / right = fals
        boolean leftAndRight = true;
        int copyIdx = 0;
        
        for (int i = 0; i < str_list.length; i++) {
        	if (str_list[i].equalsIgnoreCase("l")) {
        		leftAndRight = true;
        		copyIdx = i;
        		break;
        	} else if (str_list[i].equalsIgnoreCase("r")) {
        		leftAndRight = false;
        		copyIdx = i + 1;
        		break;
        	}
        }
        
        // left
        if (leftAndRight) {
        	answer = Arrays.copyOfRange(str_list, 0, copyIdx);
        } else if (!leftAndRight) {
        	answer = Arrays.copyOfRange(str_list, copyIdx, str_list.length);
        }
        
        System.out.println(Arrays.toString(answer));
	}

}
