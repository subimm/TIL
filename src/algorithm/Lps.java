package algorithm;

import java.util.*;

public class Lps {
    public int LPS(String str) {
        if(str.length() < 2) return 0;

        // 문자열을 두 부분으로 나누고
        // 각 부분의 첫 인덱스를 저장
        int leftIdx = 0;
        // 문자열의 길이가 홀수일 수 있으므로, 올림한다.
        int rightIdx = (str.length() / 2);

        while (rightIdx < str.length()) {
            if (str.charAt(leftIdx) == str.charAt(rightIdx)) {
                // LPS 검사를 시작한 위치부터 지금까지 계속 같은 경우
                // 다음 문자도 같은지 확인하기 위해 인덱스를 이동한다.
                leftIdx++;
                rightIdx++;
            } else {
                // leftIdx가 0인 경우, 단순히 rightIdx를 1 증가 (suffix의 시작점을 뒤로 한 칸 이동)
                // prefix, suffix가 계속 일치하다가 중간에서 일치하지 않는 경우에도,
                // 현재 suffix의 시작점을 뒤로 한 칸 이동한다.
                rightIdx = rightIdx - leftIdx + 1;
                leftIdx = 0;
            }
        }

        // LPS가 없는 경우
        return leftIdx;
    }
}
