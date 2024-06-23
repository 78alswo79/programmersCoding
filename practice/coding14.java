package practice;

public class coding14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열이 몇 번 등장하는지 세기
//		"banana"	"ana"		2
//		"aaaa"		"aa"		3
		String myString = "aaaa";
		String pat = "aa";
        int answer = 0;
        
        for (int i = 0; i < myString.length(); i++) {
        	int limitLeng = pat.length() + i;
        	if (limitLeng > myString.length()) break;
        	String getStr = myString.substring(i, limitLeng);
        	System.out.println("i = "+i + ", limitLeng = "+ limitLeng);
        	if (getStr.equals(pat)) {
        		answer++;
        	}
        }
        
        System.out.println(answer);
	}

}
