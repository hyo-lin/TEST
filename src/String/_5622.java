package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String b= bf.readLine();

        int count=0;
        int k=b.length();

        for(int i=0; i<k; i++){
            switch(b.charAt(i)){
                case 'A': case 'B': case 'c':
                    count+=3;
                    break;
                case 'D': case 'E': case 'F':
                    count+=4;
                    break;
                case 'G': case 'H': case 'I':
                    count+=5;
                    break;
                case 'J': case 'K': case 'L':
                    count+=6;
                    break;
                case 'M': case 'N': case 'O':
                    count+=7;
                    break;
                case 'P': case 'Q': case 'R':case'S':
                    count+=8;
                    break;
                case 'U': case 'V': case 'W':
                    count+=9;
                    break;
                case 'X': case 'Y': case 'Z':
                    count+=10;
                    break;

            }
        }
        System.out.print(count);
    }
}
