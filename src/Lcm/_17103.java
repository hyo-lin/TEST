package Lcm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int MAX=1000000;
        boolean[] arr=new boolean[MAX+1];

        for(int i=2; i<=MAX; i++){
            arr[i]=true;
        }

        for(int i = 2; i * i <= MAX; i++){
            if(arr[i]){
                for(int j = i * i; j <= MAX; j += i){
                    arr[j] = false;
                }
            }
        }

        int T=Integer.parseInt(bf.readLine());

        for(int i=0; i<T; i++){

            int N=Integer.parseInt(bf.readLine());

            int count = 0;
            for(int j=2; j<=N/2; j++){
                if(arr[j] && arr[N-j]){
                    count++;
                }

            } sb.append(count).append('\n');
        }
        System.out.print(sb);


    }

}
