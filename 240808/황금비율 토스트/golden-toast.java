import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> l = new LinkedList<>(); //연결리스트 생성

        int n = sc.nextInt();
        int m = sc.nextInt();

        String str = sc.next();

        for(int i=0; i<n; i++){
            l.addLast(str.charAt(i)); //입력받은 문자를 연결리스트에 값 저장
        }

        ListIterator<Character> it = l.listIterator(l.size()); //Iterator를 맨 뒤에서 시작

        for(int i=0; i<m; i++){
            String s = sc.next();

            switch(s){
                case "L": //뒤로 한 번 이동
                    it.previous();
                    break;
                
                case "R": //앞으로 한 번 이동
                    it.next();
                    break;
                
                case "P": //해당 위치에 문자 추가
                    it.add(sc.next().charAt(0));
                    break;
                
                case "D": //해당 위치 뒤에 있는 원소 삭제
                    it.next();
                    it.remove(); //remove()는 반드시 next() 수행 후 이용 가능
                    break;
            }
        }

        it = l.listIterator(); //Iterator를 다시 맨 앞으로 이동
        while (it.hasNext()){
            System.out.print(it.next()); //값을 출력하며 한 칸씩 뒤로 이동
        }
        

    }
}