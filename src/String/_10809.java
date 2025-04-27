package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str=bf.readLine();

        StringBuilder sb=new StringBuilder();
        for(char c='a'; c<='z'; c++){
            sb.append(str.indexOf(c)+" " );
        }
        System.out.println(sb);


    }


}
