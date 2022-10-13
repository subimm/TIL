import java.util.*;

public class Isogram {
    public boolean isIsogram(String str) {
        if (str.length() == 0) return true;

        str = str.toUpperCase();
        // str을 char형 배열로 만들어줌.
        char[] arr = str.toCharArray();
        // 향상된 for문
        for (char ch : arr) {
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }
}
