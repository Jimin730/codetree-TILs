// import java.util.Scanner;

// public class Main {

//     public static int n, m;
//     public static int[][] grid;
//     public static int[] seq; //한 줄씩 보기 위한 배열

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         m = sc.nextInt();
//         grid = new int[n][n];
//         seq = new int[n];

//         //격자 크기만큼 입력 받기
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++)
//                 grid[i][j] = sc.nextInt();
//         }

//         int happyNum = 0;

//         // 가로 수열 
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 seq[j] = grid[i][j];
//             }

//             if(findHappySeq()) happyNum++;
//         }

//         // 세로 수열 
//         for(int j=0; j<n; j++){
//             for(int i=0; i<n; i++){
//                 seq[i] = grid[i][j];
//             }

//             if(findHappySeq()) happyNum++;
//         }

//         System.out.println(happyNum);
//     }

//     public static boolean findHappySeq(){
//         int cnt = 1;
//         int maxCnt = 0;

//         for(int i=1; i<n; i++){
//             if(seq[i-1]==seq[i]) cnt++; //같은 수가 연속되면 cnt++
//             else cnt = 1; //연속되지 않으면 1로 초기화

//             maxCnt = Math.max(maxCnt, cnt); //반복문 한번 진행될 때마다 cnt 최댓값 갱신
//         }

//         //최대 연속 횟수가 m이상이면 true
//         return maxCnt >= m;
//     }
// }

import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;
    
    public static int n, m;
    public static int[][] grid = new int[MAX_N][MAX_N];
    
    public static int[] seq = new int[MAX_N];
    
    public static boolean isHappySequence(){
        // 주어진 seq가 행복한 수열인지 판단하는 함수입니다.
        int consecutiveCount = 1, maxCcnt = 1;
        for(int i = 1; i < n; i++) {
            if (seq[i - 1] == seq[i])
                consecutiveCount++;
            else
                consecutiveCount = 1;
            
            maxCcnt = Math.max(maxCcnt, consecutiveCount);
        }
        
        // 최대로 연속한 회수가 m이상이면 true를 반환합니다. 
        return maxCcnt >= m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int numHappy = 0;
        
        // 먼저 가로로 행복한 수열의 수를 셉니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                seq[j] = grid[i][j];
            
            if(isHappySequence())
                numHappy++;
        }
        
        // 세로로 행복한 수열의 수를 셉니다.
        for(int j = 0; j < n; j++){
            // 세로로 숫자들을 모아 새로운 수열을 만듭니다.
            for(int i = 0; i < n; i++)
                seq[i] = grid[i][j];
            
            if(isHappySequence())
                numHappy++;
        }

        System.out.print(numHappy);
    }
}