package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _11478 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        HashSet<String> has=new HashSet<>();

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                has.add(s.substring(i,j));
            }
        }
        System.out.println(has.size());
    }
}
