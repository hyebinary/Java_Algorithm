package Hashmap_TreeSet.Chapter3;

import java.io.*;
import java.util.*;

public class Main {
    public static List<Integer> solution(int N, int K, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < K - 1; i++) {
            map.put(map.get(arr[i]), map.getOrDefault(map.get(arr[i]), 0) + 1);
        }

        int lt = 0, rt = 0;
        for(rt = K - 1; rt < N; rt++) { // rt K - 1번째부터 반복문으로 이동.
            // Sliding window
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1); // rt value +1 증가
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1); // lt value -1 감소
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]); // 이후 value 0 이면 반드시 지운다.
            lt++; // lt 이동
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < solution(N, K, arr).size(); i++) {
            sb.append(solution(N, K, arr).get(i) + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
