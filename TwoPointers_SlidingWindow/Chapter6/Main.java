package TwoPointers_SlidingWindow.Chapter6;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int solution(int N, int k, int[] arr) {
        int answer = 0;

        int lt = 0, rt = 0;
        int cnt = 0;

        for(rt = 0; rt < N; rt++) {
            if(arr[rt] == 0) cnt++; // rt는 0만나면 무조건 1로 바꿔주기.
            while(cnt > k) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(solution(N, k, arr)));
        bw.flush();
        bw.close();
    }
}
