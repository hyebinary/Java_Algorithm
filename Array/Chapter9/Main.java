package Array.Chapter9;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public int solution(int rowCnt, int[][] arr) {
        int max = 2;
        int rowSum = 0; // 행의 합
        int columnSum = 0; // 열의 합

        for(int i = 0; i < rowCnt; i++) {
            rowSum = 0;
            columnSum = 0;
            for(int j = 0; j < rowCnt; j++) {
                rowSum+=arr[i][j];
                columnSum+=arr[j][i];
            }
            max = Math.max(rowSum, max);
            max = Math.max(columnSum, max);
        }

        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for(int i = 0; i < rowCnt; i++) {
            diagonalSum1+=arr[i][i];
            diagonalSum2+=arr[i][rowCnt - i - 1];
        }
        max = Math.max(diagonalSum1, max);
        max = Math.max(diagonalSum2, max);

        return max;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int rowCnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[rowCnt][rowCnt];
        for(int i = 0; i < rowCnt; i++){
            String row = br.readLine();
            st = new StringTokenizer(row);
            for(int j = 0; j < rowCnt; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(T.solution(rowCnt, arr)));
        bw.flush();
        bw.close();
    }

}
