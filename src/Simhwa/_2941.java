package Simhwa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s= bf.readLine();
        String[] a={"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(String val:a){
            s=s.replace(val,"A");
        }
        System.out.print(s.length());
    }
}
