package practice;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * [PCCP 기출문제] 1번 / 동영상 재생기
 * 풀이 참고 사이트 URL : https://code-angie.tistory.com/165
 * */
public class CodingPractice1 {

	public static void main(String[] args) {
		String video_len = "34:33";
		String pos = "13:00";
		String op_start  = "00:55";
		String op_end = "02:55";
		String[] commands = {"next", "prev"};
		String answer = "";
		
//		1. 비디오 총 길이 ~ 오프닝 엔딩 변수들을 
//		   int 타입으로 초로 컨버팅
//		2. 오프닝 스킵 스킵 후 현재위치를 구한다.
//		  2-1. 컨버트한 변수를 가지고 유효성 체크
//		3. command가 여러 입력일 경우, 오프닝 스킵 검증도
//		여러번이 필요!.
		
		int video_len_int = convertTimeStringToSeconds(video_len);
		int pos_int = convertTimeStringToSeconds(pos);
		int op_start_int = convertTimeStringToSeconds(op_start);
		int op_end_int = convertTimeStringToSeconds(op_end);

		pos_int = openingSkip(pos_int, op_start_int, op_end_int);
		
		for (String command : commands) {
			switch(command) {
			case "prev" :
				pos_int = Math.max(pos_int - 10, 0);
				break;
			default :
				pos_int = Math.min(pos_int + 10, video_len_int);
				break;
			}
			pos_int = openingSkip(pos_int, op_start_int, op_end_int);
		}
		
		answer = convertIntSecondToString(pos_int);
		System.out.println(answer);
		
	}
	
	
	public static int convertTimeStringToSeconds(String mmss) {
		int res = 0;
		String[] arrMmss = mmss.split(":");
		
		res = Integer.parseInt(arrMmss[0]) * 60 + Integer.parseInt(arrMmss[1]);
		return res;
	}
	
	public static int openingSkip(int pos_int, int op_start_int, int op_end_int) {
		int res = 0;
		if (op_start_int <= pos_int && pos_int <= op_end_int) {
			res = pos_int = op_end_int;
		} else {
			res = pos_int;
		}
		return res;
	}
	
	public static String convertIntSecondToString (int pos_int) {
		String res = (pos_int / 60 < 10 ? "0" + pos_int / 60 : pos_int / 60 ) + ":" + (pos_int % 60 < 10 ? "0" + pos_int % 60 : pos_int % 60 );
		return res;
	}
	
	
}
