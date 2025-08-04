package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String word : arr) {
            String tmp = new StringBuilder(word).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int N = Integer.parseInt(kb.nextLine());
        String[] arr = new String[N];
//        kb.nextLine(); // next 다음엔 버퍼비우기
        for(int i = 0; i < N; i++) {
            arr[i] = kb.nextLine();
        }

//        for(int i = 0; i < N; i++) {
//            System.out.println(T.solution(arr).get(i));
//        }
        for(String reversedElement : T.solution(arr)) {
            System.out.println(reversedElement);
        }
    }
}