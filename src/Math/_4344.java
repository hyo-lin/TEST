package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int j=0; j<n; j++){
            String line=br.readLine();
            StringTokenizer st=new StringTokenizer(line);

            int p=Integer.parseInt(st.nextToken());
            int[] q=new int[p];
            int sum=0;
            int count=0;
            for(int i=0; i<p; i++){

                q[i]=Integer.parseInt(st.nextToken());
                sum+=q[i];
            }

            double avg=(double)sum/p;
            for(int k=0; k<p; k++){
                if(q[k]>avg) count++;

            }System.out.println( (double)count * 100 / p + "%");


        }

    }
}
