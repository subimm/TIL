import java.util.*;

public class Permutation {
    public ArrayList<Integer[]> newChickenRecipe(int[] stuffArr, int choiceNum) {
        // 재료배열과 사용갯수를 입력받아 만들 수 있는 중복이 없는 경우의 수
        //0이 3개 이상이면 사용x,

        //사용 가능한 재료만 넣을 리스트를 선언
        ArrayList<Integer> freshArr = new ArrayList<>();

        //사용 가능한 재료만 freshArr리스트에 추가 (0이 2개 이하인 경우)
        for(int i = 0; i < stuffArr.length; i++) {
            //stuffArr[i]를 String타입으로 변환
            String str = String.valueOf(stuffArr[i]);
            //해당 값을 char타입의 배열로 바꾼 이후, 0이 들어간 갯수만큼 element 배열에 추가
            //chars() - 문자열을 스트림으로 만들기
            int[] element = str.chars().filter(c -> c == '0').toArray();
            //element 배열의 숫자가 2 이하인 경우('0'이 2번 이하인 재료의 경우)
            if(element.length <= 2) {
                //freshArr에 해당 재료를 넣기
                freshArr.add(stuffArr[i]);
            }
        }
        //freshArr 오름차순으로 정렬
        Collections.sort(freshArr);

        //사용할 수 있는 재료가 없거나, 재료가 사용재료 보다 적으면 null
        if (freshArr.size() == 0 || freshArr.size() < choiceNum) return null;

        //결과를 담을 리스트 선언
        ArrayList<Integer[]> result = new ArrayList<>();

        //해당 재료의 방문 여부 배열 선언 [false, false, ...]
        boolean[] visited = new boolean[freshArr.size()];

        //순열 재귀 함수 호출
        return permutation(choiceNum, new Integer[]{}, result, freshArr, visited, 0);
    }
    public ArrayList<Integer[]> permutation(int choiceNum, Integer[] bucket, ArrayList<Integer[]> result, ArrayList<Integer> freshArr, boolean[] visited, int depth) {
        //사용한 재료의 숫자가 choiceNum에 도달한다면(재귀 탈출)
        if(depth == choiceNum) {
            //result에 재료가 저장된 배열을 넣어준다.
            result.add(bucket);
            //해당 result를 반환
            return result;
        }
        //사용 가능한 재료 수만큼
        for(int i = 0; i < freshArr.size(); i++) {
            //해당 재료를 방문하지 않았으면 (false일 경우)
            if(!visited[i]) {
                //해당 재료의 방문 여부를 체크하고
                visited[i] = true;
                //bucket에 사용한 재료 넣기 (새로운 배열 선언)
                Integer[] concatArray = Arrays.copyOf(bucket, bucket.length + 1); //배열크기 1 씩 늘어남
                concatArray[concatArray.length - 1] = freshArr.get(i); //현재 배열 마지막 인덱스에 재료 추가

                //다시 재귀호출
                result = permutation(choiceNum, concatArray, result, freshArr, visited, depth + 1);
                //한번 재귀를 순회한 이후, 반복문을 다시 돌기 위해 재료의 사용여부를 false로 다시 바꿔줌.
                visited[i] = false;
            }
        }
        return result;
    }
}
