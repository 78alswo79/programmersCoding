package practice;

public class coding21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 여러 번 뒤집기
//		"rermgorpsam"	[{2, 3}, {0, 7}, {5, 9}, {6, 10}]	"programmers"
//		"abab" 			[{2, 3}]
		String my_string ="rermgorpsam"; 
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String answer = "";
        
        int strIdx = 0;
        int endIdx = 0;
        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < queries.length; i++) {
        	for (int j = 0; j < queries[i].length; j++) {
        		strIdx = queries[i][j];
        		endIdx = queries[i][j + 1];
        		break;
        	}
        	
        	StringBuilder reverStr = new StringBuilder(my_string.substring(strIdx,endIdx + 1));
        	sb.replace(strIdx, endIdx + 1, reverStr.reverse().toString());
        	my_string = sb.toString();
        	System.out.println(my_string);
        }
	}
}
