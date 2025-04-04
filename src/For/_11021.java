package For;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));


        int n=Integer.parseInt(bf.readLine());
        StringTokenizer st;
        for(int i=1; i<=n; i++){
            st=new StringTokenizer(bf.readLine()," ");
            System.out.println("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));


        }
        bf.close();




    }




}
