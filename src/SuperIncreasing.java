import java.util.*;

public class SuperIncreasing {
    public boolean superIncreasing(int[] arr) {
        // 합산 배열 생성
        int sum = arr[0];
        // 반복문 사용(두번째 인덱스부터 돌아서 비교해야함)
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <= sum) {
                return false;
            }
            // sum에 요소를 계속 더해줌
            sum += arr[i];
        }
        return true;
    }
}
