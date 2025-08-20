package twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2738 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken());
        int B=Integer.parseInt(st.nextToken());

        int p[][]=new int[A][B];
        int q[][]=new int[A][B];

        for(int i=0; i<A; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<B; j++){
                p[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<A; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<B; j++){
                q[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<A; i++){

            for(int j=0; j<B; j++){
                System.out.print(p[i][j]+q[i][j]+" ");
            }
            System.out.println();
        }
    }
}
