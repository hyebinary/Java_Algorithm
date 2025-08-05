package Array.Chapter4;

import java.io.*;
import java.util.Arrays;

public class Main {

    static long[] arr;

    public long fibo(int N, long[] arr) {
        arr[N] = arr[N - 1] + arr[N - 2];
        return arr[N];
    }

    public long[] solution(int N) {
        arr = new long[N + 1];

        Arrays.fill(arr, -1);
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 0; i < N + 1; i++) {
            if(arr[i] == -1) {
                arr[i] = fibo(i, arr);
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < T.solution(N).length; i++) {
            sb.append(T.solution(N)[i] + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}