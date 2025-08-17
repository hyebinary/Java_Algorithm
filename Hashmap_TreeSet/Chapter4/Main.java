package Hashmap_TreeSet.Chapter4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int solution(String S, String T) {
        int answer = 0;

        char[] S_charArr = S.toCharArray();
        char[] T_charArr = T.toCharArray();
        Map<Character, Integer> S_map = new HashMap<>();
        Map<Character, Integer> T_map = new HashMap<>();

        for(int i = 0; i < T_charArr.length; i++) {
            T_map.put(T_charArr[i], T_map.getOrDefault(T_charArr[i], 0) + 1);
        }

        for(int i = 0; i < T_charArr.length - 1; /** 💡Sliding window 위해 비교 문자열 length - 1까지만 반복문 **/ i++) {
            S_map.put(S_charArr[i], S_map.getOrDefault(S_charArr[i], 0) + 1);
        }

        int lt = 0, rt = 0;
        for(rt = T_charArr.length - 1; rt < S_charArr.length; rt++) {
            // 💡 Sliding window
            S_map.put(S_charArr[rt], S_map.getOrDefault(S_charArr[rt], 0) + 1);
            if(S_map.equals(T_map)) answer++; // 💡 주소값이 아닌 객체 값 비교
            S_map.put(S_charArr[lt], S_map.get(S_charArr[lt]) - 1); // lt value -1 감소
            if(S_map.get(S_charArr[lt]) == 0) S_map.remove(S_charArr[lt]); // 💡 이후 value 0 이면 반드시 지운다.
            lt++; // lt 이동
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        String T = br.readLine();
        bw.write(String.valueOf(solution(S, T)));
        bw.flush();
        bw.close();
    }
}
