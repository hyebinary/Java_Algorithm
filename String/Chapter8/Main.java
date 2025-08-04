package Chapter8;

import java.io.*;

public class Main {
    public String solution(String str) {
        String answer = "YES";

        // 대문자 A~Z 가 아니면 빈 값으로 대체.
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String tmp = new StringBuilder(str).reverse().toString();
        if(!tmp.equals(str)) answer = "NO";
        return answer;
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
