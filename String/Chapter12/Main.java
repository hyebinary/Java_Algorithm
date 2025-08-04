package String.Chapter12;

import java.io.*;

public class Main {
    public String solution(String str, int cnt) {
        StringBuilder answer = new StringBuilder();

        str = str.replace('#', '1').replace('*', '0');

        StringBuilder tmp = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            tmp.append(str.charAt(i));
            if(tmp.length() == 7) {
                int code = Integer.parseInt(tmp.toString(), 2); // 10진수 변환
                tmp.setLength(0);
                char c = (char) code;
                answer.append(c);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        bw.write(T.solution(br.readLine(), cnt));
        bw.flush();
        bw.close();
    }
}
