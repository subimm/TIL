package algorithm;

import java.util.*;
//문자열에서 숫자를 찾은 합계를 나머지 문자열의 길이로 나눈값 (정수반올림) 리턴
public class numSearch {
    public int numberSearch(String str) {
        // 숫자 배열 선언
        String number = "0123456789";
        if ( str.length() == 0 ) return 0;
        double sum = 0;
        String resultStr = "";

        for (int i = 0 ; i < str.length(); i++) {
            //indexOf 는 맞다면 해당 인덱스 아니라면 -1 리턴
            if(number.indexOf(str.charAt(i)) != -1) {
                // str에 number 숫자가 존재한다면 그 숫자를 sum에 더해주기
                sum = sum + Character.getNumericValue(str.charAt(i));
                //존재하지 않고, 공백이 아니라면
            } else if(str.charAt(i) != ' ') {
                //해당 문자열을 pureStr에 더하기
                resultStr += str.charAt(i);
            }
        }
        // 계산된 숫자를 문자열의 길이로 나눈 후
        double result = sum / resultStr.length();
        //Math.round를 활용하여 소수점으로부터 반올림하여 리턴
        return (int) Math.round((result * 10) / 10);
    }
}
