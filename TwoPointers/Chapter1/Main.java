package TwoPointers.Chapter1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] solution(int N, int M, int[] arr1, int[] arr2) {
        int[] answer = new int[N+M];
        int idx = 0;

        int p1 = 0, p2 = 0;
        while(p1 < N && p2 < M) {
            if(arr1[p1] > arr2[p2]) {
                answer[idx] = arr2[p2++]; // 후위증감연산자.
                idx++;
            } else {
                answer[idx] = arr1[p1++];
                idx++;
            }
        }

        while(p1 < N) {
            answer[idx] = arr1[p1++];
            idx++;
        }

        while(p2 < M) {
            answer[idx] = arr2[p2++];
            idx++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int[] answer = solution(N, M, arr1, arr2);
        for(int num : answer) {
            sb.append(num + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}