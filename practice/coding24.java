package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

public class coding24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 전국 대회 선발 고사
//		[3, 7, 2, 5, 4, 6, 1]	[false, true, true, true, true, false, false]	20403
//		[1, 2, 3]				[true, true, true]								102
//		[6, 1, 5, 2, 3, 4]		[true, false, true, false, false, true]			50200
		int[] rank = {6, 1, 5, 2, 3, 4};
		boolean[] attendance = {true, false, true, false, false, true};
        int answer = 0;
        
        List<Integer> idxList = new ArrayList<>();
        // 등수, 인덱스
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < rank.length; i++) {
        	if (attendance[i]) {
        		treeMap.put(rank[i], i);
        	}
        }
        System.out.println(treeMap);
        
        Collection<Integer> values = treeMap.values();
        for (Integer idx : values) {
        	System.out.println(idx);
        	idxList.add(idx);
        }
        
        answer = 10000 * idxList.get(0) + 100 * idxList.get(1) + idxList.get(2);
        System.out.println(answer);
        
 
	}

}
