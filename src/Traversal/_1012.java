package Traversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012 {

    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(bf.readLine());
        StringTokenizer st=new StringTokenizer(bf.readLine());

        for(int j=0; j<T; j++){
            st=new StringTokenizer(bf.readLine());
            int M=Integer.parseInt(st.nextToken());
            int N=Integer.parseInt(st.nextToken());
            int K=Integer.parseInt(st.nextToken());

            for(int i=0; i<K; i++){

                for(int l=0; l<T; l++){
                    int u=Integer.parseInt(st.nextToken());
                    int v=Integer.parseInt(st.nextToken());

                }

            }
        }




    }
}
