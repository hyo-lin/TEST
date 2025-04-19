package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _9086  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder(); //가변의 스트링을 저장

        for(int i=0; i<n;i++){
            String in=bf.readLine();
            char f=in.charAt(0);
            char l=in.charAt(in.length()-1);
            sb.append(f).append(l).append("\n");
        }
        System.out.println(sb.toString());

    }


}
