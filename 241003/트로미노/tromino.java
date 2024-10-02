import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
                grid[i][j] = sc.nextInt();
        }

        int maxResult = 0;

        //일자 블럭 가로 경우 실행
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(col+2 >= m) continue;

                //블럭 가로
                int sum = getMaxSumBlock1(row, col, col+2);
                maxResult = Math.max(maxResult, sum);
            }
        }

        //일자 블럭 세로 경우 실행
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(row+2 >= n) continue;

                //블럭 세로
                int sum = getMaxSumBlock2(col, row, row+2);
                maxResult = Math.max(maxResult, sum);
            }
        }

        //기역자 모양 블럭 경우의 수 모두 수행
        int sum = getMaxSumBlock3();
        maxResult = Math.max(maxResult, sum);

        System.out.println(maxResult);
    }

    //일자 블럭 가로
    public static int getMaxSumBlock1(int row, int colS, int colE){
        int sum = 0;

        for(int col = colS; col <= colE; col++){
            sum += grid[row][col];
        }

        return sum;
    }

    //일자 블럭 세로
    public static int getMaxSumBlock2(int col, int rowS, int rowE){
        int sum = 0;

        for(int row = rowS; row <= rowE; row++){
            sum += grid[row][col];
        }

        return sum;
    }

    //기역자 블럭
    public static int getMaxSumBlock3(){
        int sum = 0;
        int maxSum = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                //블럭 모양 1
                if(i-1>=0 && j+1<m){
                    sum = grid[i][j]+grid[i-1][j]+grid[i][j+1];
                    maxSum = Math.max(maxSum, sum);
                }
                //블럭 모양 2
                if(i+1<n && j+1<m){
                    sum = grid[i][j]+grid[i+1][j]+grid[i][j+1];
                    maxSum = Math.max(maxSum, sum);
                }
                //블럭 모양 3
                if(i+1<n && j-1>=0){
                    sum = grid[i][j]+grid[i+1][j]+grid[i][j-1];
                    maxSum = Math.max(maxSum, sum);
                }
                //블럭 모양 4
                if(i-1>=0 && j-1>=0){
                    sum = grid[i][j]+grid[i-1][j]+grid[i][j-1];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }
}