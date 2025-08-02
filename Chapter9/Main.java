package Chapter9;

import java.io.*;

public class Main {

    public int solution(String str) {
        // -------------- 1. isAlphabetic (알파벳 True) START -----------------
//        StringBuilder tmp = new StringBuilder();

//        for(int i = 0; i < str.length(); i++) {
//            if(!Character.isAlphabetic(str.charAt(i))) {
//                tmp.append(str.charAt(i));
//            }
//        }

//        return Integer.parseInt(tmp.toString());
        // -------------- 1. isAlphabetic END -----------------


        // -------------- 2. 정규식 replaceAll START -----------------
//        String digits = str.replaceAll("[^0-9]", "");
//        return Integer.parseInt(digits);
        // -------------- 2. 정규식 replaceAll END -----------------


        // -------------- 3. digits (숫자 True) START -----------------
        StringBuilder answer = new StringBuilder("");
        for(char x : str.toCharArray()) {
            if(Character.isDigit(x))
                answer.append(x);
        }
        return Integer.parseInt(answer.toString());
        // -------------- 2. digits END -----------------
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // bw.write(): 정수를 문자로 변환(ASCII/Unicode 값)하므로, 정수를 입력받으면 반드시 String으로 변환 작업 필요함.
        bw.write(String.valueOf(T.solution(br.readLine())));
        bw.flush();
        bw.close();
    }
}