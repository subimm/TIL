import java.util.*;

public class BoardGame {
    public Integer boardGame(int[][] board, String operation) {
        // N*N 크기의 보드판 위에서 UDRL을 입력받아 이동. 숫자 합산 게임

        //보드의 길이 변수 선언
        int Len = board.length;
        //점수 변수 선언
        int score = 0;
        //String operation을 배열로 만들기
        char[] arr = operation.toCharArray();
        //현재위치 변수 선언
        int current = board[0][0];
        //시작은 0,0 부터 시작
        int X = 0;
        int Y = 0;
        //첫 시작은 D나 R로 시작해야함
        //반복문(operationd의 길이 만큼)
        for(int i =0; i<arr.length; i++){
            //조건
            //-> U를 입력받으면 현재 있는 (x,y)에서 (x-1,y)로 이동
            if(arr[i] == 'U') X += -1;
            //-> D를 입력받으면 현재 있는 (x,y)에서 (x+1,y)로 이동
            if(arr[i] == 'D') X += 1;
            //-> L을 입력받으면 현재 있는 (x,y)에서 (x,y-1)로 이동
            if(arr[i] == 'L') Y += -1;
            //-> R을 입력받으면 현재 있는 (x,y)에서 (x,y+1)로 이동
            if(arr[i] == 'R') Y += 1;
            // 보드 밖으로 나갈 경우(X,Y가 음수이거나 보드의 길이보다 클 경우)
            if(Y < 0 || Y > board.length || X < 0 || X > board.length) {
                return null;
            }
            //현재 위치 할당 후 점수에 넣기
            current = board[X][Y];
            score = score + current;
        }
        return score;
    }
}