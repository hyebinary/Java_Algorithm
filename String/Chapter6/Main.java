package Chapter6;

import java.io.*;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();



        // -------------- 1. contains START -----------------
//        List<Character> list = new ArrayList<>();
//        char[] chars = str.toCharArray();
//        for(char c : chars) {
//            if(list.contains(c)) continue;
//            list.add(c);
//            answer.append(c);
//        }
        // -------------- 1. contains START -----------------


        // -------------- 2. indexOf START -----------------
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer.append(str.charAt(i));
            }
        }
        // -------------- 2. indexOf END -----------------

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(T.solution(br.readLine()));
        bw.flush();
        bw.close();
    }
}
