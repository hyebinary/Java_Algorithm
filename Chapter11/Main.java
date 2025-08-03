package Chapter11;

import java.io.*;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

//        int cnt = 0;
//        char tmp = 0;
//        for(int i = 0; i < str.length(); i++){
//            char c = str.charAt(i);
//
//            if(i == 0) { // 첫번째 원소는 반드시 넣기
//                tmp = c;
//                answer.append(c);
//                cnt++;
//            } else {
//                if(tmp == c) { // 이전 원소와 같은 문자일 경우
//                    cnt++;
//                    if(i == str.length() - 1) { // 마지막 원소는 카운팅 바로 출력
//                        answer.append(cnt);
//                    }
//                } else { // 이전 원소와 다른 문자일 경우
//                    if(cnt > 1) { // 카운팅 1이 아닐 경우 카운팅 출력
//                        answer.append(cnt);
//                    }
//                    answer.append(c); // 새로운 문자열 출력
//                    tmp = c; // 새로운 문자열로 초기화
//                    cnt = 1;
//                }
//            }
//        }

        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if(i != str.length() - 1) {
                char c1 = str.charAt(i);
                char c2 = str.charAt(i + 1);
                if(c1 == c2) {
                    cnt++;
                } else {
                    answer.append(c1);
                    if(cnt > 1) {
                        answer.append(cnt);
                    }
                    cnt = 1;
                }
            } else {
                char c1 = str.charAt(i);
                answer.append(c1);
                if(cnt > 1) {
                    answer.append(cnt);
                }
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(T.solution(br.readLine()));
        bw.flush();
        bw.close();
    }
}
