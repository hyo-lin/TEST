package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        int result=0;
        for(int i=1; i<N; i++){
            int number=i; // 직접 i로 나누면 순서가 꼬이기 때문
            int sum=0;

            while(number!=0){
                sum+=number%10;
                number/=10;
            }

            if(sum+i==N){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}
