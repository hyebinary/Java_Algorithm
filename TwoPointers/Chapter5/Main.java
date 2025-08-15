package TwoPointers.Chapter5;

import java.io.*;

public class Main {
    public static int solution(int N) {
        int answer = 0;

        int lt = 1, rt;
        int sum = 0;

        for(rt = 1; rt < N; rt++) {
            sum += rt;
            if(sum == N) answer++;
            while(sum > N) {
                sum -= lt++;
                if(sum == N) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(solution(N)));
        bw.flush();
        bw.close();
    }
}
