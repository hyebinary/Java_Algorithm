package Hashmap_TreeSet.Chapter1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static char solution(int N, char[] arr) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap();

//        map.containsKey('A'); // boolean 반환.
//        map.size(); // key 갯수
//        map.remove('A'); // key 삭제
//        for ( ... : map.keySet()) // 탐색

//        for(int i = 0; i < N; i++) {
//            if(map.get(arr[i]) != null) map.put(arr[i], map.get(arr[i]) + 1);
//            else map.put(arr[i], 1);
//        }

        for(char x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        bw.write(String.valueOf(solution(N, arr)));
        bw.flush();
        bw.close();
    }
}
