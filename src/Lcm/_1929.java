package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        StringBuilder sb=new StringBuilder();
            for(int i=N; i<=M; i++){
                if(isPrime(i)){
                    sb.append(i).append("\n");
                };
            }
        System.out.println(sb);

    }

    public static boolean isPrime(int a){
        if(a<2) return false;
        for(int i=2; i*i<=a; i++){
            if(a%i==0) return false;

        }return true;
    }
}
