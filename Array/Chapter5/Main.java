package Array.Chapter5;

import java.io.*;
import java.util.Arrays;

public class Main {

    public String solution(int N) {
        int answer = 0;

        // 0에서 n까지
        boolean[] primeNumArr = new boolean[N + 1];
        // 모두 true로 초기화
        Arrays.fill(primeNumArr, true);
        // 0과 1은 소수 아님
        primeNumArr[0] = false;
        primeNumArr[1] = false;

        // 제곱근까지만 판별하면 곱셈에서 대칭되는 수도 걸러낼 수 있음
        int squareRoot = (int) Math.sqrt(N);
        // 2부터 시작해서 소수 걸러내기
        for(int i = 2; i <= squareRoot; i++) {
            if(primeNumArr[i]) {
                // i의 배수 모두 합성수 처리
                for(int j = i * i; j <= N; j += i) {
                    primeNumArr[j] = false;
                }
            }
        }

        for(boolean primeYn : primeNumArr) {
            if(primeYn) {
                answer++;
            }
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        bw.write(T.solution(Integer.parseInt(br.readLine())));
        bw.flush();
        bw.close();
    }

}