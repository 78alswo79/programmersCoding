package practice;

public class coding6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		"abcdevwxyz"	"lllllvwxyz"
//		"jjnnllkkmm"	"llnnllllmm"
		
		String myString = "jjnnllkkmm";
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
        	if (myString.substring(i, i + 1).compareTo("l") < 0) 
        	{
        		// subStr값이 "l"보다 사전순이 앞에 있다면
        		answer += "l";
        	} 
        	else 
        	{
        		answer += myString.substring(i, i + 1);
        	}
        }
        System.out.println(answer);
        
		// regex 표현
//        String myString = "abcdevwxyz";
//        String answer = "";
//        
//        answer = myString.replaceAll("[a-k]", "l");
//        
//        System.out.println(answer);
        
	}

}
