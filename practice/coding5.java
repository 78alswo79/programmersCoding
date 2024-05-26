package practice;

import java.util.Arrays;

public class coding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		"oxooxoxxox"		[1, 2, 1, 0, 1, 0]
//		"xabcxdefxghi"		[0, 3, 3, 3]
		String myString = "xabcxdefxghi"; 
        String[] res = {};
        
        int len = 0;
        for (int i = 0; i < myString.length(); i++) {
        	if (myString.substring(i, i + 1).equals("x"))
        	{
        		len++;
        	}
        }
//        System.out.println(len);
        
        res = myString.split("[x]", len + 1);
        
        for (int i = 0; i < res.length; i++) {
//        	System.out.println(res[i].length());
        	res[i] = res[i].length()+"";
        }
        System.out.println(Arrays.toString(res));

	}

}
