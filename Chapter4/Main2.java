package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public ArrayList<String> solution(String[] arr) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : arr) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length - 1;
            // reverse 로직
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // char배열을 String화
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
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