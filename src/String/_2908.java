package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int A=Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B=Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.print(A>B ? A:B);
    }


}
