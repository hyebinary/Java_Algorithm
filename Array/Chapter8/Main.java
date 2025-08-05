package Array.Chapter8;

import java.io.*;
import java.util.*;

public class Main {

    public Map<Integer, Integer> solution(int N, Integer[] orderedArr) {
        int rank = 1;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            map.putIfAbsent(orderedArr[i], rank);
            rank++;
        }

        return map;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 점수 배열
        int[] arr = new int[N];
        // 내림차순 정렬 점수 배열
        Integer[] orderedArr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            orderedArr[i] = arr[i];
        }
        Arrays.sort(orderedArr, Collections.reverseOrder());

        Map<Integer, Integer> map = T.solution(N, orderedArr);

        StringBuilder sb = new StringBuilder();
        for(int score : arr) {
            sb.append(map.get(score)).append(" "); // 점수로 등수 찾기
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}