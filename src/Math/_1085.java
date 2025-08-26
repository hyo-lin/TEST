package Math;

import java.io.*;
import java.util.StringTokenizer;

public class _1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st.nextToken());
        int y=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int h=Integer.parseInt(st.nextToken());

        int dist1 = x;       // 왼쪽까지 거리
        int dist2 = w - x;   // 오른쪽까지 거리
        int dist3 = y;       // 위쪽까지 거리
        int dist4 = h - y;   // 아래쪽까지 거리

        int answer = Math.min(Math.min(dist1, dist2), Math.min(dist3, dist4));
        System.out.println(answer);
    }
}

