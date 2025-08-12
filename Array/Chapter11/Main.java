package Array.Chapter11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public int solution(int studentCnt, int[][] arr) {
        int answer = 0;

        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= studentCnt; i++) {
            int sameClassCnt = 0; // i번 학생의 다른 학생들과의 같은 반을 했던 학생 수
            for(int j = 1; j <= studentCnt; j++) {
                for(int k = 1; k <= 5; k++) { // 학년 비교
                    if(arr[i][k] == arr[j][k]) { // 같은 반 한 번이라도 했다면
                        sameClassCnt++;
                        break; // 같은 반을 했던 총 횟수를 구하는 게 아니고, 같은 반을 했던 학생 수를 구해야 하므로 break.
                    }
                }
            }

            if(sameClassCnt > max) {
                max = sameClassCnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentCnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[studentCnt + 1][6]; // 인덱스로 접근하기 위해 1행, 1열에 '0' 라인 추가
        for(int i = 1; i <= studentCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(T.solution(studentCnt, arr)));
        bw.flush();
        bw.close();
    }
}
