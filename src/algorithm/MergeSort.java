package algorithm;

public class MergeSort {
    public int[] mergeSort(int[] arr) {
        sort(arr);
        return arr;
    }

    public int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr, int left, int right) {
        if(left < right) {
            // 가운데 인덱스를 구합니다.
            int mid = (left + right) / 2;
            // 배열의 중앙을 기준으로 2개의 그룹으로 분할합니다.
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            // 정렬, 병합 과정을 실행합니다.
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        // 임시로 사용할 배열을 선언합니다.
        int[] temp = new int[arr.length];
        // 해당 배열에 기존 arr 배열을 복사합니다.
        System.arraycopy(arr, 0, temp, 0, arr.length);

        // leftIdx : 좌측 배열의 시작 인덱스
        int leftIdx = left;
        // rightIdx : 우측 배열의 시작 인덱스
        int rightIdx = mid + 1;
        // index: 정렬된 값을 병합된 배열에 넣을 인덱스
        int index = left;

        // 좌측 배열, 우측 배열 두 배열중 한쪽의 요소가 모두 없어질 때까지 반복합니다.
        while(leftIdx <= mid && rightIdx <= right) {
            if(temp[leftIdx] <= temp[rightIdx]) {
                arr[index++] = temp[leftIdx++];
            } else {
                arr[index++] = temp[rightIdx++];
            }
        }

        // 좌측 배열의 요소가 남았을 경우, 남은 요소를 넣어줍니다.
        // 오른쪽 그룹의 원소가 남는 경우는 따로 처리하지 않아도 됩니다.
        for(int i=0; i<=mid-leftIdx; i++) {
            arr[index+i] = temp[leftIdx+i];
        }
    }
}
