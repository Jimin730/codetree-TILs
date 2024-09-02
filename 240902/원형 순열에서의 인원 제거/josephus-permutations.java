import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for(int i=0; i<N; i++){
            q.add(i+1);
        }

        while (q.size() != 0) {
            for(int i=0; i<K-1; i++){
                q.add(q.peek());
                q.poll();
            }
            sb.append(q.poll()).append(" ");
        }

        System.out.println(sb);
        sc.close();
    }
}