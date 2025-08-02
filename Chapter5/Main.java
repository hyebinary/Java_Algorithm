package Chapter5;

import java.io.*;

public class Main {
    public String solution(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
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
