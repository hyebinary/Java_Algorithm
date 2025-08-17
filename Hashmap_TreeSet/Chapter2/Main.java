package Hashmap_TreeSet.Chapter2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String solution(String str1, String str2) {
        Map<Character, Integer> map = new HashMap<>();
        for(char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for(char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();
        bw.write(String.valueOf(solution(str1, str2)));
        bw.flush();
        bw.close();
    }
}
