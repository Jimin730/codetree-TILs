import java.util.Scanner;

public class Main {
    
    public static void heapify(int[] arr, int n, int i){
        int largest = i; //최대 노드가 i로 가정
        int left = i * 2;
        int right = i * 2 + 1;

        if(left <= n && arr[left] > arr[largest])
            largest = left;
        
        if(right <= n && arr[right] > arr[largest])
            largest = right;

        if(largest != i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr, int n){
        for(int i=n/2; i>=1; i--){
            heapify(arr, n, i);
        }

        for(int i=n; i>1; i--){
            swap(arr, 1, i);
            heapify(arr, i-1, 1);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int tmp = 0;
        tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }

        heapSort(arr, n);

        for(int i=1; i<=n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}