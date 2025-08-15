package TwoPointers.Chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int solution(int N, int k, int[] arr) {
        int sum = 0, answer = 0;

        // 초기화
        for(int i = 0; i < k; i++) sum += arr[i];
        answer = sum;

        for(int i = k; i < N; i++) {
            sum += (arr[i] - arr[i-k]); // Sliding window - 오른쪽으로 이동하면서 오른쪽 원소 추가, 왼쪽 원소 제거.
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 전체 일수
        int K = Integer.parseInt(st.nextToken()); // 연속되는 일수

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(N, K, arr)));
        bw.flush();
        bw.close();
    }
}
