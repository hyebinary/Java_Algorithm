package TwoPointers.Chapter2;

import java.io.*;
import java.util.*;

public class Main {
    public static List<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        // 투포인터 비교 전 오름차순 정렬.
        Arrays.sort(arr1); // 참조형의 경우 Collections.reverseOrder()으로 내림차순 사용 가능
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        while(p1 < N && p2 < M) { // 배열 하나라도 탐색 끝난다면 더이상 공통원소 없는 것으로 간주.
            // 두 배열 모두 오름차순 정렬이므로 값이 더 작은 원소의 배열 포인터를 증가시켜야 함.
            if(arr1[p1] > arr2[p2]) {
                p2++;
            } else if(arr1[p1] < arr2[p2]) {
                p1++;
            } else { // 공통원소 찾았으면 두 배열 모두 포인터 이동.
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
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
        List<Integer> answer = solution(N, M, arr1, arr2);
        for(int num : answer) {
            sb.append(num + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}