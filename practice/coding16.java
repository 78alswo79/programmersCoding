package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class coding16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 묶기
		// ["a","bc","d","efg","hi"]		2
		String[] strArr = {"a","bc","d","efg","hi"};
        int answer = 0;
		
        for (int i = 0; i < strArr.length; i++) {
        	strArr[i] = strArr[i].length()+"";
        }
        
        List<String> strList = new ArrayList<String>(Arrays.asList(strArr));
        List<Integer> res = new ArrayList<>();

        Set<String> set = new HashSet<String>(strList);
        
        for (String item : set) {
//        	System.out.println(item + " : " + Collections.frequency(strList, item));
        	res.add(Collections.frequency(strList, item));
        }
        answer = Collections.max(res);
        System.out.println(answer);
	}

}
