package Array.Chapter2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public String solution(int N, int[] heightArr) {
        int cnt = 1, max = heightArr[0];

        for(int i = 1; i < N; i++) {
            if(max < heightArr[i]) {
                cnt++;
                max = heightArr[i];
            }
        }

        return String.valueOf(cnt);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int[] heightArr = new int[N];
        for(int i = 0; i < N; i++) {
            heightArr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(T.solution(N, heightArr));
        bw.flush();
        bw.close();
    }
}