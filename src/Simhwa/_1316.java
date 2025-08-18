package Simhwa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0; i<n; i++){
            String word=br.readLine();
            if(counter(word)){
                count++;
            }

        }
        System.out.println(count);
    }

    static boolean counter(String word){
        boolean[] al=new boolean[26];
        char prev=0;

        for(int i=0; i<word.length(); i++){
            char now=word.charAt(i);
            if(now!=prev){
                if(al[now-'a']){
                    return false;
                }al[now-'a']= true;
                prev=now;}

        } return true;
    }

}
