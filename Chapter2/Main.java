package Chapter2;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(char x : str.toCharArray()) {
            // 1.
//            if(Character.isLowerCase(x)) answer.append(Character.toUpperCase(x));
//            else answer.append(Character.toLowerCase(x));

            // 2. ASCII
            if(x >= 97 && x <= 122) answer.append((char)(x - 32));
            else answer.append((char)(x + 32));
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
