import java.util.Scanner;

public class Main {

    public static int n;
    public static int m;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                grid[i][j] = sc.nextInt();
        }

        int happyNum = findHappySeq();

        System.out.println(happyNum);
    }

    public static int findHappySeq(){
        int happyNum = 0;

        for(int i=0; i<n; i++){
            //열 기준
            int tmp = 0;
            int cnt = 1; //몇 개가 연속되어 있는지 확인을 위한 변수
            for(int col=0; col<n; col++){
                if(tmp == 0) { //비교값이 아직 없을 경우
                    tmp = grid[i][col]; //비교할 값에 현재 값을 넣어주고 다음 반복문 실행
                    continue;
                } 
                else {
                    if(tmp == grid[i][col]) cnt++; //비교할 값과 현재 값이 같다면 cnt값 증가
                    else if(tmp != grid[i][col]){ //비교할 값과 현재 값이 같지 않다면 (연속되지 않다면)
                        tmp = grid[i][col]; //현재 값으로 비교할 값 초기화
                        cnt = 1; //1로 다시 초기화
                    }
                }

                if(cnt/m >= 1) happyNum++;
            }


            tmp = 0;
            cnt = 1;
            //행 기준
            for(int row=0; row<n; row++){
                if(tmp == 0) { //비교값이 아직 없을 경우
                    tmp = grid[row][i]; //비교할 값에 현재 값을 넣어주고 다음 반복문 실행
                    continue;
                } 
                else {
                    if(tmp == grid[row][i]) cnt++; //비교할 값과 현재 값이 같다면 cnt값 증가
                    else if(tmp != grid[row][i]){ //비교할 값과 현재 값이 같지 않다면 (연속되지 않다면)
                        tmp = grid[row][i]; //현재 값으로 비교할 값 초기화
                        cnt = 1; //1로 다시 초기화
                    }
                }
                if(cnt/m >= 1) happyNum++; 
            }
        }

        return happyNum;
    }
}