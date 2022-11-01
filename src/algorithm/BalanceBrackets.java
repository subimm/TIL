package algorithm;

import java.util.*;

public class BalanceBrackets {
    public boolean balancedBrackets(String str) {
        //스택을 사용합니다.
        Stack<Character> stack = new Stack<>();
        //HashMap을 선언해준 이후, 쌍이 맞는 괄호를 키와 값으로 할당합니다.
        HashMap<Character, Character> opener = new HashMap<>();
        opener.put('{', '}');
        opener.put('[', ']');
        opener.put('(', ')');

        //괄호의 뒷부분을 따로 String으로 선언합니다.
        String closer = "}])";

        //입력받은 문자열을 모두 순회하면서
        for(int i = 0; i < str.length(); i++) {
            //현재 문자열이 괄호의 시작 부분일 경우(선언한 Map에 해당 문자열의 키가 존재하는 경우)
            if(opener.containsKey(str.charAt(i))) {
                //스택에 해당 문자열을 삽입합니다.
                stack.push(str.charAt(i));
                //현재 문자열이 괄호의 마지막 부분이고, 스택이 비어있지 않은 경우(선언한 String에 해당 문자열이 존재하는 경우)
                //스택이 비어있다면, 괄호가 열리기 전에 괄호의 뒷부분이 온 상황이므로, 해당 조건에 함께 추가
            } else if(closer.indexOf(str.charAt(i)) != -1 && stack.size() > 0) {
                //스택에서 꺼낸 값과, 해당 키와 매칭되는 값을 찾아 현재 문자열과 비교
                char top = stack.pop();
                char pair = opener.get(top);
                //비교한 값이 다르다면 false를 리턴합니다.
                if(pair != str.charAt(i)) {
                    return false;
                }
                //그 외의 경우(스택이 비어있고, 현재 문자열이 괄호의 뒷부분인 경우) false를 리턴합니다.
            } else {
                return false;
            }
        }
        //남아있는 스택이 없다면 true, 존재한다면 false를 리턴합니다.
        return stack.size() == 0;
    }
}

