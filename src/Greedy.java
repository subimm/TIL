import java.util.*;

public class Greedy {
    public int movingStuff(int[] stuff, int limit) {
        // 한번에 최대 2개의 짐 / 박스를 최대 적게 사용 / 모든 짐을 옮기는 박스갯수의 최솟값

        // 짐 갯수 변수 선언
        int count = 0;
        // 짐 배열을 오름차순으로 정렬 sort
        Arrays.sort(stuff);
        // 짐의 최솟값을 left, 최댓값을 right 변수로선언
        int left = 0;
        int right = stuff.length-1;
        // 반복문 (right>=left)
        while (right >= left) {
            // 조건(배열 최솟값과 최댓값을 더했을 때 limit 이하인 경우 )
            if(stuff[left]+stuff[right] <= limit){
                // 짐을 넣었으니 최솟값 1 증가
                left++;
                // 짐을 넣었으니 최댓값 1 감소
                right--;
                // 짐 갯수 1 증가
                count++;
            }
            //else 무게제한 초과시
            else {
                //최댓값 1 감소 (최댓값 짐 하나만 넣을수 있음)
                right--;
                //짐 갯수 1 증가
                count++;
            }
        }
        //리턴 짐 갯수
        return count;
    }
}
