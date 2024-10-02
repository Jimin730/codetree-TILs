import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[][] grid;
    public static int[] seq; //한 줄씩 보기 위한 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][n];
        seq = new int[n];

        //격자 크기만큼 입력 받기
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                grid[i][j] = sc.nextInt();
        }

        int happyNum = 0;

        // 가로 수열 
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                seq[j] = grid[i][j];
            }

            if(findHappySeq()) happyNum++;
        }

        // 세로 수열 
        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                seq[i] = grid[i][j];
            }

            if(findHappySeq()) happyNum++;
        }

        System.out.println(happyNum);
    }

    public static boolean findHappySeq(){
        int cnt = 1;
        int maxCnt = 1; //1로 안해주면 테스트 케이스 n=1, m=1 격자 1을 통과할 수 없음

        for(int i=1; i<n; i++){
            if(seq[i-1]==seq[i]) cnt++; //같은 수가 연속되면 cnt++
            else cnt = 1; //연속되지 않으면 1로 초기화

            maxCnt = Math.max(maxCnt, cnt); //반복문 한번 진행될 때마다 cnt 최댓값 갱신
        }

        //최대 연속 횟수가 m이상이면 true
        return maxCnt >= m;
    }
}