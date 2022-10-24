package algorithm;

import java.util.*;

public class BubbleSort {
    //변수 바꾸는 메서드 선언
    public int[] swap(int idx1, int idx2, int[] arr) {

        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }

    public int[] bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length -1; i++) {
            //횟수 기록
            int swaps = 0;

            for(int j = 0; j <arr.length -1; j++) {
                if(arr[j] > arr[j+1]) {
                    swaps++;
                    arr = swap(j, j+1, arr);
                }
            }
            if(swaps == 0) {
                break;
            }
        }
        return arr;
    }

}

