package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _27866  {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String p=bf.readLine();
        int n=Integer.parseInt(bf.readLine())-1;
        System.out.println(p.charAt(n));



    }


}
