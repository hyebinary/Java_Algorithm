package Chapter3;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        int max = 0;
//        1. split
//        String[] arr = str.split(" ");
//        for(String element : arr) {
//            int len = element.length();
//             if(max < len) {
//                 max = len;
//                 answer = element;
//             }
//        }

//        2. indexOf
        while(str.indexOf(' ') != -1) {
            String tmp = str.substring(0, str.indexOf(' '));
            int len = tmp.length();
            if(max < len) {
                max = len;
                answer = tmp;
            }
            str = str.substring(str.indexOf(' ') + 1);
        }
        if(str.length() > max) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

}