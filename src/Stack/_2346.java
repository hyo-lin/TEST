package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


public class _2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<int[]> que = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for (int i = 1; i <=N; i++) {
            int value = Integer.parseInt(st.nextToken());
            que.add(new int[]{i, value});
        }

        while (!que.isEmpty()) {
            int[] current = que.pollFirst();
            int index = current[0]; //index
            int moveValue = current[1]; //value

            sb.append(index).append(" ");

            if (que.isEmpty()) break;

            if (moveValue > 0) {
                for (int i = 0; i < moveValue - 1; i++) {
                    que.addLast(que.pollFirst());
                }
            }

            else{
                    for (int i = 0; i < -moveValue; i++) {
                        que.addFirst(que.pollLast());
                    }

                }
                }

                System.out.println(sb);
    }
}
