import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static final int MAX_N = 100000;
    public static final int MAX_K = 6; //6자리까지 가능(문제 조건)
    public static final int MAX_DIGIT = 10; //2차원배열 만들 때 사용할 최대 크기

    public static int n;
    public static int[] arr = new int[MAX_N];

    public static void radixSort() {
        int p = 1;
        for(int pos=0; pos < MAX_K; pos++){
            //ArrayList로 2차원 배열 생성
            ArrayList<Integer>[] arrNew = new ArrayList[MAX_DIGIT];
            for(int i=0; i<MAX_DIGIT; i++){
                arrNew[i] = new ArrayList<>(); 
            }

            //자릿수 별로 계산
            for(int i=0; i<n; i++){
                int digit = (arr[i] / p) % 10;
                arrNew[digit].add(arr[i]);
            }

            int index = 0;
            for(int i=0; i<MAX_DIGIT; i++){
                for(int j=0; j<arrNew[i].size(); j++){
                    arr[index++] = arrNew[i].get(j);
                }
            }

            p *= 10; //자리수 계산
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        radixSort();

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}