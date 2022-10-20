package algorithm;

import java.util.*;

public class CompressString {
    public String compressString(String str) {
        if(str.length() == 0) return "";

        //비교할 첫번째 문자열 선언
        char before = str.charAt(0);
        //중복값 카운트
        int count = 1;
        //결과 변수 선언
        String result = "";
        //마지막 부분 더미 선언
        str = str + ' ';
        for(int i =1; i < str.length(); i++){
            //중복문자가 있다면 카운트 +1
            if(before == str.charAt(i)) {
                count++;
                //없다면
            } else {
                //카운트가 3 이상인 것만 압축
                if (count >= 3) {
                    result = result + count + before;
                    //3이상이 아니면 카운트만큼만 반복
                } else {
                    for(int j = 0; j < count; j++) {
                        result += before;
                    }
                }
                // 비교문자에 반복하면서 i 넣어주기
                before = str.charAt(i);
                count = 1;
            }
        }
        return result;
    }
}