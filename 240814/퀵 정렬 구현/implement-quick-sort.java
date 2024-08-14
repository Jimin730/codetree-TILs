import java.util.Scanner;

public class Main {

    public static final int MAX_N = 100000;

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pos = partition(arr, low, high);

            quickSort(arr, low, pos-1);
            quickSort(arr, pos+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; //피벗 값은 편의상 맨 뒤에 있는 값으로 설정
        int i = low - 1;

        for(int j=low; j<=high-1; j++){
            
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, high);
        return i+1;
    }

    public static void swap(int[] arr, int a, int b){
        int tmp = 0;
        tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}