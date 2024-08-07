import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        LinkedList<Integer> l = new LinkedList<>();
        
        int N = sc.nextInt();
        
        for(int i=0; i<N; i++){
            String str = sc.next();

            switch(str){
                case "push_front":
                    l.addFirst(sc.nextInt());
                    break;
                
                case "push_back":
                    l.addLast(sc.nextInt());
                    break;
                
                case "pop_front":
                    sb.append(l.pollFirst()).append("\n");
                    break;
                
                case "pop_back":
                    sb.append(l.pollLast()).append("\n");
                    break;
                
                case "size":
                    sb.append(l.size()).append("\n");
                    break;
                
                case "empty":
                    int stm = l.isEmpty() ? 1 : 0;
                    //l.isEmpty() ? sb.append("1").append("\n") : sb.append("0").append("\n");
                    sb.append(stm).append("\n");
                    break;
                
                case "front":
                    sb.append(l.peekFirst()).append("\n");
                    break;
                
                case "back":
                    sb.append(l.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        //sc.close;
    }
}