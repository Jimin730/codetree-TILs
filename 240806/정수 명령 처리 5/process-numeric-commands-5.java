import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String str = sc.next();
            switch(str){
                case "push_back": 
                    arr.add(sc.nextInt());
                    break;

                case "pop_back": 
                    arr.remove(arr.size()-1);
                    break;
                
                case "size":
                    sb.append(arr.size()).append("\n");
                    break;
                
                case "get":
                    sb.append(arr.get(sc.nextInt()-1)).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        sc.close();
    }
}