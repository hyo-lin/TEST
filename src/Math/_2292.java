package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int count=1;
        int range=1;
        if(n==1){
            System.out.println(1);
        }else{
            while(range<n){
                range=range+(6*count);
                count++;
            }
            System.out.println(count);
        }

    }
}
