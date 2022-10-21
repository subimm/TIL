package algorithm;

import java.util.*;

public class MaxMultiply {
    public int largestProductOfThree(int[] arr) {
        //오름차순 정리 후 가장 큰 수 3개
        Arrays.sort(arr);

        int maxNum = (arr[arr.length-1]) * (arr[arr.length-2]) * (arr[arr.length-3]);

        //가장 작은 음수 2가지와 가장 큰 양수 1가지
        int maxNum2 = (arr[arr.length-1]) * arr[0] * arr[1];

        return Math.max(maxNum,maxNum2);
    }
}