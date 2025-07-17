package Simhwa;

import java.io.*;


public class _10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        StringBuilder sb=new StringBuilder(a);
        if(a.equals(sb.reverse().toString())){
            System.out.print(1);
        }else{
            System.out.print(0);
        }


    }

}
