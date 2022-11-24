package algorithm;

public class Lscs {
    // dynamic programming: O(N)
    //LSCS : 주어진 배열의 연속된 부분 배열의 합을 구할때 이 중 가장 큰 값
    public int LSCS(int[] arr) {
        int subArrSum = 0; // 연속 배열의 합
        int max = Integer.MIN_VALUE; // 정답의 후보를 저장, 음수를 포함하기 때문에 사용 가능한 최저 음수를 할당
        for(int i = 0; i < arr.length; i++) {
            subArrSum = subArrSum + arr[i];
            if(subArrSum > max) max = subArrSum;

            // 연속된 구간의 합이 음수인 경우,
            // 해당 부분은 버리고 다시 시작해도 된다.
            if (subArrSum < 0) {
                subArrSum = 0;
            }
        }
        return max;
    }
}
