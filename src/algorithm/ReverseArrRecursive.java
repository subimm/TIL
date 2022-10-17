package algorithm;

import java.util.*;

public class ReverseArrRecursive {
    public int[] reverseArr(int[] arr){
        //wo
        //재귀탈출문
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        //재귀함수 사용
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] result = new int[head.length + tail.length];
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);
        return result;
    }
}