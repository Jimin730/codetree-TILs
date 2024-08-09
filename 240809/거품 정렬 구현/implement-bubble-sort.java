import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        do{
            sorted = true;
            int tmp = 0;
            for(int i=0; i<n-1; i++){
                if(arr[i] > arr[i+1]){
                tmp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = tmp;
                sorted = false;
                }
            }
            
        } while (sorted == false);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}