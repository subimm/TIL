package algorithm;

import java.util.*;

public class OverPermutation {
    public ArrayList<String[]> rockPaperScissors(int rounds) {
        // 라운드에 따른 가위바위보 경우의 수
        // 1. 재귀함수 생성
        //   함수는 배열을 완성한다.
        //   길이가 rounds인 배열을 완성
        //결과 리스트 선언
        ArrayList<String[]> result = new ArrayList<>();

        //재귀함수 불러오기
        return permutation(rounds, new String[]{}, result);
    }
    //재귀호출 메서드
    public ArrayList<String[]> permutation(int rounds, String[] play, ArrayList<String[]> result) {
        //재귀가 끝나는(더 이상 나눌 수 없는 부분)
        if(rounds == 0) {
            result.add(play);
            return result;
        }
        // 나눌 수 있는 부분
        String[] rps = {"rock", "paper", "scissors"};
        //재귀호출을 통해서 play 배열을 완성시키는 코드
        for(int i = 0; i < rps.length; i++) {
            //현재 라운드에 낼 가위바위보
            String current = rps[i];
            //빈 배열에서 라운드진행 마다 배열 크기 1칸씩 증가시키기
            String[] currentArr = Arrays.copyOf(play, play.length + 1);
            //현재 배열 마지막 인덱스에 가위바위보 추가
            currentArr[currentArr.length -1 ] = current;
            // 다시 재귀 호출
            result = permutation(rounds -1, currentArr, result);
        }
        return result;
    }
}
