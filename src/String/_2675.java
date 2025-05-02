package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++){ //총 몇개를 테스트할 것인가
            String[] p=bf.readLine().split(" "); //공백으로 나눠서
            int count=Integer.parseInt(p[0]);
            String word=p[1];
            for(int j=0; j<word.length(); j++){ //스트링이어서 length()
                for(int k=0; k<count; k++){
                    System.out.print(word.charAt(j)); //읽기
                }
            }
            System.out.println();
        }




    }


}
