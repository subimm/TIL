import java.util.*;

public class removeStringArray {
    public String[] removeExtremes(String[] arr) {
        // 공백을 입력받으면 널 리턴
        if(arr.length == 0) return null;
        int max = 0;
        int min = 20;
        int maxIdx = 0;
        int minIdx = 0;
        //반복문. 가장 긴 문자열 찾기
        for(int i = 0; i< arr.length; i++){
            //해당 문자열이 max 보다 클 때
            if (arr[i].length() >= max) {
                max = arr[i].length();
                maxIdx = i;
            }
            //해당 문자열이 min 보다 작을 때
            if(arr[i].length() <= min) {
                min = arr[i].length();
                minIdx = i;
            }
        }
        //결과 배열 선언하기

        String[] result = new String[arr.length - 2];
        int curIndex = 0;
        //배열을 순회하며 결과를 넣어준 후
        for (int i = 0; i < arr.length; i++) {
            //i가 가장 긴 문자열과 가장 짧은 문자열이 아닐 경우
            if (i != minIdx && i != maxIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }
        return result;
        // 내가 쓴 코드
        //String[] resultFirst = new String[arr.length - 1];
        //System.arraycopy(arr, maxIdx + 1, resultFirst, maxIdx, arr.length - maxIdx -1 );
        //String[] resultSecond = new String[resultFirst.length - 1];
        //System.arraycopy(resultFirst, minIdx + 1, resultSecond, minIdx, resultFirst.length - minIdx -1 );

        //return resultSecond;
    }
}