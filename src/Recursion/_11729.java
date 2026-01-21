package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11729 {
    static StringBuilder sb ;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());

        sb = new StringBuilder();

        System.out.println((int) Math.pow(2, N) - 1);
        hanoi(N, 1, 2, 3);
        System.out.println(sb);

    }

    public static void hanoi(int N, int start, int mid, int to){
        if(N==1){
            sb.append(start+" "+to+"\n");
            return;
        }
        hanoi(N-1, start, to, mid);
        sb.append(start+" "+to+"\n");
        hanoi(N-1, mid, start,to);
    }
}
