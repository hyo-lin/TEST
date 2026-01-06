package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1427 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        char[] arr = bf.readLine().toCharArray();
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);

        }
        System.out.println(sb);

    }
}
