import java.util.*;

public class Combination {
    public int cardGame(int[] cards) {
        // 카드의 배열을 입력받아 3장으로 카드 조합하여 소수 판별하기
        //3장의 카드 조합
        //소수인지 여부 판별
        int count = 0;

        for(int i = 0; i < cards.length; i++) {
            for(int j = i+1; j < cards.length; j++) {
                for(int k = j+1; k < cards.length; k++) {
                    int num = cards[i] + cards[j] + cards[k];
                    if(isPrime(num)) count++;
                }
            }
        }
        return count;
    }
    public boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){ // Math.sqrt(num) 제곱근까지만 판별해도 가능
            if(num % i == 0) return false;
        }
        return true;
    }
}