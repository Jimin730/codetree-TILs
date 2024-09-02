import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String str = sc.next();

            switch(str){
                case "push_front":
                    dq.addFirst(sc.nextInt());
                    break;

                case "push_back":
                    dq.addLast(sc.nextInt());
                    break;
                
                case "pop_front":
                    sb.append(dq.pollFirst()).append("\n");
                    break;
                
                case "pop_back":
                    sb.append(dq.pollLast()).append("\n");
                    break;
                
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;

                case "empty":
                    int bool = dq.isEmpty() ? 1 : 0;
                    sb.append(bool).append("\n");
                    break;
                
                case "front":
                    sb.append(dq.peekFirst()).append("\n");
                    break;
                
                case "back":
                    sb.append(dq.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        sc.close();
    }
}