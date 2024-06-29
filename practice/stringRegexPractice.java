package practice;

import java.util.Arrays;

public class stringRegexPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SSR DOCS OZ ACKI - P/KR/M15461548/212312/19MAR89/KIM/TEST MR 		--> X
		// SSR DOCS OZ ACKI - P/KOR/M15461548/212312/19MAR89/KIM/TEST MS		--> X
		// SSR DOCS OZ ACKI - P/KOR/19MAR89/KIM/TEST MS							--> X
		// SSR DOCS OZ ACKI - P/KOR/M15461548/212312/19MAR89/KIM/TEST			--> O
		// SSR DOCS OZ ACKI P/KR/GIMOZZI////15JUN97/KIM/MINJAE					--> O	
		// SSR DOCS OZ ACKI P/KR/GIMOZZI////M157845484/KIM/MINJAE				--> X
		// SSR DOCS OZ ACKI P/KR/GIMOZZI////15JUN97								--> X
		// SSR DOCS OZ ACKI P/KR/GIMOZZI////0104251121							--> X
		// SSR DOCS OZ ACKI ////0104251121/LEE/MINJAE							--> X
		
		String param = "SSR DOCS OZ ACKI P/KR/GIMOZZI////M157845484/KIM/MINJAE";

		// 미주케이스
		// 정규표현신 +한 부분은 정확한 자릿수를 표기해주는게 더 안전할거 같군그래.
		if (param.matches("^(SSR DOCS OZ ACKI) - (P)/(KOR)/(M\\w+)/(\\w+)/\\d{2}[a-zA-Z]{3}\\d{2}/[a-zA-Z]+/[a-zA-Z]+")) {
			System.out.println("미주케이스 입니다.");
			String[] strArr = param.split("/");
			if (strArr[4].matches("\\d{2}[a-zA-Z]{3}\\d{2}")) {
				System.out.println(strArr[4]);
			}
		}
		
		// 미주외의 케이스
		if (param.matches("^(SSR DOCS OZ ACKI) (P)/(KR)/[a-zA-Z]+////\\d{2}[a-zA-Z]{3}\\d{2}/[a-zA-Z]+/[a-zA-Z]+")) {
			System.out.println("미주케이스 이 이외의 케이스이네요.");
			String[] strArr = param.split("////");
			System.out.println(Arrays.toString(strArr));
			if (strArr[1].substring(0, strArr[1].indexOf("/")).matches("\\d{2}[a-zA-Z]{3}\\d{2}")) {
				System.out.println(strArr[1].substring(0, strArr[1].indexOf("/")));				
			}
		}
	}

}
