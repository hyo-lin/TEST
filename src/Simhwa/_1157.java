package Simhwa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
    public static void main (String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a=bf.readLine().toUpperCase();

        int al[]=new int[26];
        for(int i=0; i<a.length(); i++){
            char ch=a.charAt(i);
            al[ch-'A']++;
        }

        int max=-1;
        char answer='?';

        for(int i=0; i<26; i++){
            if(al[i]>max){
                max=al[i];
                answer=(char)(i+'A');
            }else if(max==al[i]){
                answer='?';
            }

        }
        System.out.print(answer);
    }

}
