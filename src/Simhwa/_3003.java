package Simhwa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int k=1;
        int q=1;
        int r=2;
        int b=2;
        int n=2;
        int p=8;

        StringTokenizer st=new StringTokenizer(bf.readLine()," ");
        k=k-Integer.parseInt(st.nextToken());
        q=q-Integer.parseInt(st.nextToken());
        r=r-Integer.parseInt(st.nextToken());
        b=b-Integer.parseInt(st.nextToken());
        n=n-Integer.parseInt(st.nextToken());
        p=p-Integer.parseInt(st.nextToken());

        System.out.println(k+" "+q+" "+r+" "+b+" "+n+" "+p);



    }

}
