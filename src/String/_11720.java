package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int sum=0;
        String[] str=bf.readLine().split(""); //수
        for(int i=0; i<n; i++){
            sum+=Integer.parseInt(str[i]); //n 만큼 읽음
        }


        System.out.println(sum);

    }


}
