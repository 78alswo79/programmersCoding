package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class autoCheckin_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1[] = {"E", "M", "E"};
//		String arr2[] = {"S1", "S2"};
		String arr3[] = { "ICN/NRT S1", "NRT/ICN S2"};
		
		// 신청 구간별 승객 오토체크인 케이스.
		for (int i = 0; i <arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
				for (int c = 0; c < arr3.length; c++) {
					System.out.println(arr1[i] + " " + /* arr2[j] + " " + */ arr3[c]);
				}
//			}
		}
		
		
		
		
		
		// 이중 리스트 생성
//        List<List<String>> listOfLists = new ArrayList<>();
//
//        // 첫 번째 내부 리스트 생성 및 추가
//        List<String> firstList = new ArrayList<>();
//        firstList.add("Apple");
//        firstList.add("Banana");
//        listOfLists.add(firstList);
//
//        // 두 번째 내부 리스트 생성 및 추가
//        List<String> secondList = new ArrayList<>();
//        secondList.add("Carrot");
//        secondList.add("Daikon");
//        listOfLists.add(secondList);
//
//        // 이중 리스트 출력
//        for (List<String> list : listOfLists) {
////            for (String item : list) {
//                System.out.println(list);
////            }
//        }
	}

}
