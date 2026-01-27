package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1012 {

    static int[][] gp;
    static boolean[][] bool;

    static int T;
    static int M;
    static int N;
    static int K;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(bf.readLine());




        for (int j = 0; j < T; j++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            gp = new int[N][M];
            bool = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(bf.readLine());
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                gp[v][u] = 1;

            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int l = 0; l < M; l++) {
                    if (gp[i][l] == 1 && !bool[i][l]) {
                        dfs(i, l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }


    public static void dfs(int y, int x) {
        bool[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int xn = dx[i] + x;
            int yn = dy[i] + y;
            if (xn >= 0 && yn >= 0 && xn < M && yn < N) {
                if (gp[yn][xn] == 1 && !bool[yn][xn]) {
                    dfs(yn, xn);
                }
            }

        }
    }
}

