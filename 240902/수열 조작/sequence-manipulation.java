import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            dq.addFirst(i+1);
        }

        while (dq.size() != 1){
            dq.pollLast();
            dq.addFirst(dq.pollLast());
        }

        System.out.println(dq.pollLast());
        sc.close();
    }
}