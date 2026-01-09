package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4948 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        while(true){
            int N=Integer.parseInt(bf.readLine());
            if(N==0) break;
            int count=0;
            for(int i=N+1; i<=2*N; i++){
             if(isPrime(i)){

                 count++;
             };
            } sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0)
            return false;
        }return true;
    }

}
