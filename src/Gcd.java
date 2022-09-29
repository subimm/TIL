import java.util.*;

public class Gcd {
    public ArrayList<Integer[]> equity(int M, int N) {
        //결과 리스트 생성
        ArrayList<Integer[]> result = new ArrayList<>();
        // 최대공약수 구하기 (유클리드 호제법)
        int GCD = gcd(M, N);

        for(int i = 1; i <= GCD; i++ ) {
            if(GCD % i == 0) { //i 가 최대공약수의 약수인지 확인
                result.add(new Integer[]{ i, M/i, N/i });
            }
        }
        return result;
    }
    //최대공약수 메서드
    public int gcd(int m, int n) {
        if (m % n == 0) return n;
        return gcd(n, m % n);
    }
}