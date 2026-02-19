package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9461 {
    static int[] arr;
    static long[] ar;

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(bf.readLine());
        arr=new int[T];
        ar=new long[10001];

        ar[1]=1;
        ar[2]=1;
        ar[3]=1;

        for(int i=0; i<T; i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }

        for(int i=4; i<10000; i++){
            ar[i] = ar[i-2] + ar[i-3];
        }

        for(int i=0; i<T; i++){

            System.out.println(ar[arr[i]]);
        }


    }
}
