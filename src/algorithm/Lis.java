package algorithm;

import java.util.*;
import java.util.stream.Stream;

public class Lis {
    public int LIS(int[] arr) {
        int N = arr.length;
        // lis[i]는 i에서 끝나는 LIS의 길이를 저장
        // 최소한 각 요소 하나로 LIS를 만들 수 있으므로 1로 초기화한다.
        int[] lis = new int[N];
        Arrays.fill(lis, 1);
        for(int i = 1; i < N; i++) {
            // i에서 끝나는 LIS의 길이
            for (int j = 0; j < i; j++) {
                // i 이전의 인덱스만 검사하면 된다.
                // i는 1부터 시작하므로, 짧은 길이부터 검사한다. (bottom-up 방식)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        return Arrays.stream(lis).max().getAsInt();
    }
}

