package algorithm;

import java.util.*;

public class Decryption {
    public String decryptCaesarCipher(String str, int secret) {
        // TODO:
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' ') {
                result += str.charAt(i);
            } else {
                //이외의 경우, alpha에서 현재 문자열의 index를 찾아준 이후,
                int asis = alpha.indexOf(str.charAt(i));
                //복호화는 반대 방향으로 이루어기 때문에 seceret을 빼주게 됩니다.
                //전체 길이를 더하고, 나머지를 구하는 이유는 해당 문자열의 index를 벗어날 경우를 고려한 계산식
                int tobe = (asis - secret + alpha.length()) % alpha.length();
                //복호화한 문자열을 result에 추가합니다.
                result = result + alpha.charAt(tobe);
            }
        }
        return result;

    }
}