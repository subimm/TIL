package algorithm;

import java.util.*;

public class HeapSort {
    public int[] heapSort(int[] arr) {
        // 힙 정렬에 사용될 힙(우선순위 큐)을 선언
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        // 배열의 값을 힙에 모두 할당
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        // 힙에서 우선순위가 가장 높은 원소(root노드)를 하나씩 배열에 넣기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}
