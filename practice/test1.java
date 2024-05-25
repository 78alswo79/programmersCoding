package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class test1 {

	public static void main(String[] args) {
//		[2, 1, 6]			1		[1, 6, 2]
//		[5, 2, 1, 7, 5]		3		[7, 5, 5, 2, 1]
		
		// 내 방식
		int[] num_list = {2, 1, 6};
		int n = 1;
	    int[] answer = new int[num_list.length];
	    
	    List<Integer> intList = new ArrayList<Integer>();
	    
	    for (int i = 0; i < num_list.length; i++) {
	    	if (i >= n) 
	    	{
	    		intList.add(num_list[i]);
	    	}
	    }
	    
	    if (num_list.length != intList.size())
	    {
	    	int diff = num_list.length - intList.size();
	    	for (int i = 0; i < diff; i++) {
	    		intList.add(num_list[i]);
	    		
	    	}
	    }
	    answer = intList.stream().mapToInt(i -> i).toArray();
	    System.out.println(Arrays.toString(answer));
	    
		// 다른 사람의 방식
		int[] num_list = {2, 1, 6};
		int n = 1;
	    int[] answer = new int[num_list.length];
		
	    for (int i = 0; i < num_list.length; i++) {
	    	answer[i] = num_list[(i + n) % num_list.length];
	    }
	    System.out.println(Arrays.toString(answer));
	}
}
