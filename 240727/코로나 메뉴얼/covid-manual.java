import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        char[] arr = new char[3];

        for (int i=0; i<3; i++){
            String s = sc.next();
            int t = sc.nextInt();

            if(t>=37) {
                if(s.equals("Y")){
                    arr[i] = 'A';
                } else {
                    arr[i] = 'B';
                }
            } else {
                if(s.equals("Y")){
                    arr[i] = 'C';
                } else {
                    arr[i] = 'D';
                }
            }
        }

        int count = 0;

        for(char c: arr){
            if(c == 'A'){
                count++;
            }
        }

        if(count>=2){
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}