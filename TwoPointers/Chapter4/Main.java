package TwoPointers.Chapter4;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int solution(int N, int M, int[] arr) {
        int answer = 0;

        int p1 = 0, p2 = 0, sum = 0;
        for(int i = 0; i < N; i++) {
            sum += arr[p2++];
            if(sum == M) answer++;
            while(sum > M) {
                sum -= arr[p1++];
                if(sum == M) answer++; // 왼쪽 포인터 옮긴 후 다시 타겟넘버와 비교해주기.
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(N, M, arr)));
        bw.flush();
        bw.close();
    }
}
