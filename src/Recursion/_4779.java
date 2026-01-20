package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4779 {
    static StringBuilder sb;
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str=bf.readLine())!=null && !str.isEmpty()){
            int N=Integer.parseInt(str);

            sb=new StringBuilder();

            centor(N);

            System.out.println(sb.toString());
        }


        }


    public static void centor(int N){
        if(N==0){
            sb.append("-");
            return;
        }
        centor(N-1);

        int len=(int)Math.pow(3,N-1);
        for(int i=0; i<len; i++){
            sb.append(" ");
        }
        centor(N-1);
    }
}
