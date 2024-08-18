import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String str = sc.next();

            switch(str){
                case "push":
                    s.push(sc.nextInt());
                    break;
                
                case "pop":
                    sb.append(s.pop()).append("\n");
                    break;
                
                case "size":
                    sb.append(s.size()).append("\n");
                    break;
                
                case "empty":
                    int bool = 0;
                    bool = s.isEmpty() ? 1 : 0;
                    sb.append(bool).append("\n");
                    break;
                
                case "top":
                    sb.append(s.peek()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        sc.close();
    }
}