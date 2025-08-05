package Array.Chapter6;

import java.io.*;
import java.util.*;

public class Main {

    // 소수 판별 - 소수라면 소수 Return, 아니라면 -1 Return
    public int isPrimeNumber(int reversedNumber) {
        // 제곱근까지만 확인하면 대칭되는 수도 지워낼 수 있음.
        int squareRoot = (int)Math.sqrt(reversedNumber);

        // 2 이상부터 제곱근까지 검사해서 나눠진다면 -> 최소 약수가 2개는 생기는 것. (곱셈의 대칭 특성) -> 그러면 소수아님 (=합성수)
        if(reversedNumber < 2) return -1;
        for(int i = 2; i <= squareRoot; i++) {
            if(reversedNumber % i == 0) return -1;
        }
        return reversedNumber;
    }

    public List<Integer> solution(int N, String[] arr) {
        List<Integer> list = new ArrayList<>();

//        for문으로 arr 원소 각각 뒤집어서 소수인지 판별 후 list에 추가
        for(int i = 0; i < arr.length; i++) {
            StringBuilder reversedNumber = new StringBuilder(arr[i]).reverse();
            int isPrimeNumber = isPrimeNumber(Integer.parseInt(reversedNumber.toString()));
            if(isPrimeNumber != -1) list.add(isPrimeNumber);
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr = new String[N];
        for(int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        StringBuilder sb = new StringBuilder();
        for(int answer : T.solution(N, arr)) {
            sb.append(answer + " ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}