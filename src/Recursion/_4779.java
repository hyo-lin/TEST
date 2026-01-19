package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4779 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder();

        if(N==0){
            System.out.println("-");
        }else if(N==1){
            String m="- - ";
        }else{
            for(int i=0; i<N; i++){
                sb.append(m);
            }
        }
    }
}
