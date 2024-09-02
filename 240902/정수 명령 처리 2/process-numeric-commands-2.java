import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String str = sc.next();

            switch(str){
                case "push":
                    q.add(sc.nextInt());
                    break;

                case "pop":
                    sb.append(q.poll()).append("\n");
                    break;
                
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                
                case "empty":
                    int bool = q.isEmpty() ? 1 : 0;
                    sb.append(bool).append("\n");
                    break;
                
                case "front":
                    sb.append(q.peek()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        sc.close();
    }
}