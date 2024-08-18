import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        String str = sc.next();
        int count = 0;

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '('){
                s.push(c);
            } else {
                if(s.isEmpty() == true){
                    System.out.println("No");
                    break;
                }
                s.pop();
            }

            count++;
        }

        if(s.isEmpty() == false){
            System.out.println("No");
        } else if(s.isEmpty() == true && count == str.length()){
            System.out.println("Yes");
        }

    }
}