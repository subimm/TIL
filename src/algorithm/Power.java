package algorithm;

import java.util.*;

public class Power {
    public long power(int base, int exponent) {
        //시간복잡도 O(logN)
        if(exponent == 0) return 1;

        int half = exponent / 2;
        long temp = power(base, half);
        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1) return (base * result) % 94906249;
        else return result;
    }
}