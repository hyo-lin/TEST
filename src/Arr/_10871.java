package Arr;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;


import static javax.swing.text.html.HTML.Attribute.N;

public class _10871 {
    public static void main(String[] args) throws IOException{

        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk=new StringTokenizer(bf.readLine(), " ");
        int N=Integer.parseInt(stk.nextToken());
        int X=Integer.parseInt(stk.nextToken());

        stk=new StringTokenizer(bf.readLine());
        for(int i=0; i<N; i++){
            int a=Integer.parseInt(stk.nextToken());
            if(a<X){
                System.out.print(a+" ");

            }
        }







    }




}
