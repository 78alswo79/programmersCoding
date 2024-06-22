package practice;

public class coding11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 뒤집기
//		"Progra21Sremm3"	6	12	"ProgrammerS123"
//		"Stanley1yelnatS"	4	10	"Stanley1yelnatS"
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
        String answer = "";
           
        // reverse()를 이용하여 풀기.
        StringBuilder strB = new StringBuilder(my_string.substring(s, e + 1));
        StringBuilder strB2 = new StringBuilder(my_string.substring(s, e + 1));
        
        answer = my_string.replace(strB, strB2.reverse());
        System.out.println(answer);
        
        // for문으로 만들어보기.
        String revStr = "";
        for (int i = e; i >= s; i--) {
        	System.out.println(my_string.substring(i, i + 1));
        	revStr += my_string.substring(i, i + 1);
        }
        my_string = my_string.replace(my_string.substring(s, e + 1), revStr); 
        System.out.println(my_string);
        
        // concat으로 풀기
        String temp = my_string.substring(s, e+1);

 		String tempStr = "";
 		for (int i = temp.length() - 1; i >= 0; i--) {
 			tempStr += temp.substring(i, i+1);
 		}
		
 		answer = answer.concat(my_string.substring(0, s).concat(tempStr).concat(my_string.substring(e+1)));
 		System.out.println(answer);
	}

}
