package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class IsSubsetOf {
    public boolean isSubsetOf(int[] base, int[] sample) {
        // 배열 리스트로 변환
        List<Integer> result
                = Arrays.stream(base)
                .boxed()
                .collect(Collectors.toList());

        for (int i : sample) {
            if (!result.contains(i)) {
                return false;
            }
        }
        return true;
    }
}