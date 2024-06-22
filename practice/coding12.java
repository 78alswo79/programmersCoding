package practice;

public class coding12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
//		"AbCdEFG"	"dE"	"AbCdE"
//		"AAAAaaaa"	"a"		"AAAAaaaa"
		String myString = "AAAAaaaa";
		String pat = "a";
        String answer = "";
        
        answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());
        System.out.println(answer);
        
	}

}
