package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7569 {

    static int N;
    static int M;
    static int H;

    static int[][][] arr;
    static int[] dx = { -1, 1, 0, 0, 0, 0 };
    static int[] dy = { 0, 0, -1, 1, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, -1, 1 };
    static Queue<int[]> que=new LinkedList<>();

    public static void main(String[] args)throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        M=Integer.parseInt(st.nextToken());
        N=Integer.parseInt(st.nextToken());
        H=Integer.parseInt(st.nextToken());

        arr = new int[H][N][M];

        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < M; j++) {
                    arr[k][i][j] = Integer.parseInt(st.nextToken());
                    if (arr[k][i][j] == 1) {
                        // 높이(k), 세로(i), 가로(j) 순서로 저장
                        que.add(new int[]{k, i, j});
                    }
                }
            }
        }
        System.out.println(bfs());
    }

    static int bfs() {
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int z = cur[0]; // 높이
            int x = cur[1]; // 세로
            int y = cur[2]; // 가로

            for (int i = 0; i < 6; i++) { // 6방향 탐색
                int nz = z + dz[i];
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크 (높이 H, 세로 N, 가로 M)
                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < N && ny < M && nz < H) {
                    // [수정 3] 안 익은 토마토(0)인 경우에만 진행
                    if (arr[nz][nx][ny] == 0) {
                        arr[nz][nx][ny] = arr[z][x][y] + 1;
                        que.add(new int[]{nz, nx, ny});
                    }
                }
            }
        }

        int max = 0;
        // 전체 탐색하여 안 익은 토마토가 있는지 확인
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[k][i][j] == 0) return -1;
                    max = Math.max(max, arr[k][i][j]);
                }
            }
        }

        // 시작값이 1이었으므로 결과에서 1 빼기
        return max - 1;
    }
}
