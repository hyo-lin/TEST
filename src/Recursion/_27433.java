package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27433 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());

        System.out.println(fact(N));


    }

    public static long fact(int N){
        if(N==0) return 1;
        else{
            return N*fact(N-1);
        }
    }
}
