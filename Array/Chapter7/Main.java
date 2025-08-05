package Array.Chapter7;

import java.io.*;
import java.util.*;

public class Main {

    public String solution(int N, int[] arr) {
        int score = 0;
        int tmp = 0;

        for(int i = 0; i < N; i++) {
            if(i == 0) {
                if(arr[i] == 1) {
                    score++;
                    tmp++;
                }
            } else {
                if(arr[i] == 1) {
                    tmp++;
                    if(arr[i - 1] == 1) {
                        score += tmp;
                    } else {
                        score++;
                    }
                } else {
                    tmp = 0;
                }
            }
        }

        return String.valueOf(score);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(T.solution(N, arr));
        bw.flush();
        bw.close();
    }

}