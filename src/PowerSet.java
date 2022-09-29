import java.util.*;

public class PowerSet {
    public ArrayList<String[]> powerSet(String[] element) {
        // 멱집합 구하기
        //search 함수에서 사용할 빈 스택을 선언
        Stack<String> stack = new Stack<>();

        //결과를 담을 ArrayList
        ArrayList<String[]> result = new ArrayList<>();

        //재료들을 오름차순으로 정렬
        Arrays.sort(element);

        // 빈 스택과 0 번째 인덱스(depth), 재료 배열, 결과를 담을 List를 인자로 받는 재귀 함수 호출
        result = search(stack, 0, element, result);

        // 결과 오름차순 정렬
        result.sort((o1, o2) -> Arrays.toString(o1).compareTo(Arrays.toString(o2)));
        //결과를 반환
        return result;
    }
    // 재귀 함수 만들기
    public ArrayList<String[]> search(Stack<String> stack, int idx, String[] element, ArrayList<String[]> result) {
        // 재귀 함수 탈출 조건
        if (idx >= element.length) {
            //idx와 element의 길이가 같거나 크다면(마지막까지 검토한 경우)
            String[] arr = stack.toArray(new String[0]); //스택을 배열로 변환
            result.add(arr); // 변환한 배열 result 리스트에 넣기
            return result; // 재귀로 다시 올라가기
        } else {
            // idx가 부분집합에 포함된 경우
            stack.push(element[idx]); // 스택에 하나씩 넣기
            search(stack, idx + 1, element, result); // depth 1 증가시켜서 다시 재귀

            // idx가 부분집합에 포함되지 않은 경우
            stack.pop();// if에서 탈출하여 호출된 재귀함수 실행 위치
            search(stack, idx + 1, element, result);
        }
        return result;
    }
}