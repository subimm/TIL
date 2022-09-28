import java.util.*;

public class GreedyCoin {
    public int partTimeJob(int k) {

        // 거스름돈을 받았을때, 최댓값 동전 500원 부터 채우고, 안채워지면 그다음 최댓값, 반복
        // 동전 배열 선언
        int[] cointypes = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        //반복문 (코인 갯수까지)
        for(int i =0; i < 6; i++){
            // 코인변수에 코인타입 요소들 넣기
            int coin = cointypes[i];
            //거스름돈 += 총금액/coin
            cnt += k/coin;
            // 총금액 %= coin;
            k %= coin;
        }
        return cnt;
    }
}
