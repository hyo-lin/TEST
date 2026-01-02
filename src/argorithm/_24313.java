package argorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _24313 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
        int j=Integer.parseInt(bf.readLine());
        int k=Integer.parseInt(bf.readLine());
        if(n*k+p<=j*k&& (n <= j)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
