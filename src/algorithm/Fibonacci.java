package algorithm;

import java.util.*;

public class Fibonacci {
    // naive solution: O(2^N)
    // public int fibonacci(int num) {
    // 	if (num <= 1) return num;
    // 	return fibonacci(num - 1) + fibonacci(num - 2);
    // }

    // dynamic with meoization: O(N)
    // 이미 해결한 문제의 정답을 따로 기록해두고,
    // 다시 해결하지 않는 기법
    // fibo(10)
    // = fibo(9) + fibo(8)
    // = fibo(8) + fibo(7) + fibo(7) + fibo(6)
    public int fibonacci(int num) {
        ArrayList<Integer> memo = new ArrayList<>();
        memo.add(0);
        memo.add(1);

        return aux(memo, num);
    }

    public int aux(ArrayList<Integer> memo, int num) {
        if (memo.size() <= num) {
            memo.add(aux(memo, num - 1) + aux(memo, num - 2));
        }
        return memo.get(num);
    }
}

