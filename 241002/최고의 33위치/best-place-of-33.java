import java.util.Scanner;

public class Main {

    static int N;
    static int[][] grid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];
        int maxGold = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
                if(row + 2 >= N || col + 2 >= N)
                    continue;
                
                int numOfGold = getNumOfGold(row, row+2, col, col+2);

                maxGold = Math.max(maxGold, numOfGold);                
            }
        }

        System.out.println(maxGold);
    }

    public static int getNumOfGold(int rowN, int rowS, int colW, int colE){
        int numOfGold = 0;

        for(int row = rowN; row <= rowS; row++){
            for(int col = colW; col <= colE; col++){
                numOfGold += grid[row][col];
            }
        }
        return numOfGold;
    }
}