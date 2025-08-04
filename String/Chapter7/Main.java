package Chapter7;

import java.io.*;

public class Main {
    public String solution(String str) {
        String answer = "YES";

        // -------------- 1. String upperCase START -----------------
//        int lt = 0, rt = str.length() - 1;
//        while(lt < rt) {
//            if(str.charAt(lt) == str.charAt(rt)) {
//                lt+=1;
//                rt-=1;
//            } else {
//                answer = "NO";
//                break;
//            }
//        }
        // -------------- 1. String upperCase END -----------------

        // -------------- 2. StringBuilder START -----------------
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";
        // -------------- 2. StringBuilder END -----------------

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        bw.write(T.solution(br.readLine().toUpperCase()));
        bw.write(T.solution(br.readLine()));
        bw.flush();
        bw.close();

    }

}
