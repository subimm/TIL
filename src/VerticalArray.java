import java.util.*;

public class VerticalArray {
    public String readVertically(String[] arr) {
        //가장 긴 문자열의 길이 탐색
        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].length()) {
                max = arr[i].length();
            }
        }
        //임시로 맥스 길이만큼의 배열을 선언,
        String[] temp = new String[max];
        //기존의 배열을 순회
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            //해당 배열의 요소인 문자열 순회
            for(int j = 0; j < str.length(); j++) {
                //임시 배열이 null이면
                if(temp[j] == null) {
                    //문자열의 j번째 char를 String으로 변환후 배열에 삽입 (세로위치 첫 문자열)
                    temp[j] = Character.toString(str.charAt(j));
                    //임시 배열이 null이 아니면, 임시 배열 기존에 현재 j번째 char를 삽입
                } else {
                    temp[j] += str.charAt(j);
                }
            }
        }
        //배열을 순회하며 String으로 변환
        String result = "";
        for(int i = 0; i < temp.length; i++) {
            result += temp[i];
        }
        return result;
    }
}