package twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char[][] al=new char[5][15];

        for(int i=0; i<5; i++){
            String a=br.readLine();
            for(int j=0; j<a.length(); j++){
                al[i][j]=a.charAt(j);
            }
        }

        StringBuilder sb=new StringBuilder();
        for(int j=0; j<15; j++){
            for(int i=0; i<5; i++){
                if(al[i][j]!='\0'){
                    sb.append(al[i][j]);
                }
            }
        }
        System.out.print(sb.toString());

    }
}
