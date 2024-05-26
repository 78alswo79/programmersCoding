package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class coding7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		"axbxcxxdx"			["a","b","c","d"]
//		"dxccxbbbxaaaa"		["aaaa","bbb","cc","d"]
		
		String myString = "axbxcxxdx";
        String[] answer = {};
        
        String[] tempArr = {};
        List<String> strList = new ArrayList<String>();
        
        tempArr = myString.split("[x]");
        Arrays.sort(tempArr);
        
        for (int i = 0; i < tempArr.length; i++) {
        	if (!tempArr[i].isBlank())
        	{
        		strList.add(tempArr[i]);
        	}
        }
        answer = strList.toArray(new String[strList.size()]);
        
        System.out.println(Arrays.toString(answer));

	}

}
