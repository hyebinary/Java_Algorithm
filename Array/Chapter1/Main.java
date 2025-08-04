package Array.Chapter1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public List<Long> solution(int N, long[] arr) {
        List<Long> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(i == 0 || arr[i-1] < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < T.solution(N, arr).size(); i++) {
//            sb.append(T.solution(N, arr).get(i) + " ");
//        }
        for(long x : T.solution(N, arr)) {
            sb.append(x + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
