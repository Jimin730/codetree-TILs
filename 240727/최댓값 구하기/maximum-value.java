import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;

        if(a>=b && a>=c){
            max = a;
        } else if(b>=a && b>=c){
            max = b;
        } else {
            max = c;
        }

        System.out.println(max);
    }
}