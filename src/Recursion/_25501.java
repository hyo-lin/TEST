package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _25501 {
    static int count=0;
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(bf.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<N; i++){
            String M=bf.readLine();
            count=0;

            int result =isPalindrome(M);
            sb.append(result).append(" ").append(count).append("\n");
        }

        System.out.println(sb);
    }

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

}
