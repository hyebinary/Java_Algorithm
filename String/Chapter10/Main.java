package String.Chapter10;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        int distance = 1000; //
        for(int i = 0; i < answer.length; i++) {
            if(str.charAt(i) == c) {
                distance = 0;
                answer[i] = distance;
            } else {
                distance++;
                answer[i] = distance;
            }
        }

        for(int i = answer.length - 1; i >= 0; i--) {
            if(str.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        String str = st.nextToken();
        char c = st.nextToken().charAt(0);

        for(int x : T.solution(str, c)) {
            bw.write(x + " ");
        }
        bw.flush();
        bw.close();
    }
}