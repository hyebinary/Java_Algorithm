package Array.Chapter3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public String[] solution(int N, int[] arr_A, int[] arr_B) {
        String[] winner = new String[N];

        for(int i = 0; i < N; i++) {
            int A = arr_A[i];
            int B = arr_B[i];

            if(A == B) {
                winner[i] = "D";
            } else {
                if(A == 1) {
                    switch(B) {
                        case 2:
                            winner[i] = "B";
                            break;
                        case 3:
                            winner[i] = "A";
                            break;

                    }
                } else if(A == 2) {
                    switch(B) {
                        case 1:
                            winner[i] = "A";
                            break;
                        case 3:
                            winner[i] = "B";
                            break;
                    }
                } else {
                    switch(B) {
                        case 1:
                            winner[i] = "B";
                            break;
                        case 2:
                            winner[i] = "A";
                            break;
                    }
                }
            }
        }

        return winner;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String A = br.readLine();
        StringTokenizer st_A = new StringTokenizer(A);
        int[] arr_A = new int[N];
        for(int i = 0; i < arr_A.length; i++) {
            arr_A[i] = Integer.parseInt(st_A.nextToken());
        }

        String B = br.readLine();
        StringTokenizer st_B = new StringTokenizer(B);
        int[] arr_B = new int[N];
        for(int i = 0; i < arr_B.length; i++) {
            arr_B[i] = Integer.parseInt(st_B.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(String winner : T.solution(N, arr_A, arr_B)) {
            sb.append(winner + "\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
