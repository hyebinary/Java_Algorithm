package Array.Chapter10;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
//    public int solution(int N, int[][] arr) {
//        int answer = 0;
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                int target = arr[i][j];
//                int left = arr[i][j-1];
//                int right = arr[i][j+1];
//                int top = arr[i-1][j];
//                int bottom = arr[i+1][j];
//                if(target > left && target > right && target > top && target > bottom) {
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }

    // 상 하 좌 우
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[][] arr;

    public static int solution(int N, int[][] arr) {
        int answer = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && ny >= 0 && nx < N && ny < N && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                int token = Integer.parseInt(st.nextToken());
                arr[i][j] = token;
            }
        }

        bw.write(String.valueOf(solution(N, arr)));
        bw.flush();
        bw.close();
    }
}
