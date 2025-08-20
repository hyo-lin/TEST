package twoarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2566 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];

        for(int i=0; i<9; i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int big=arr[0][0];
        int row=1;
        int col=1;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j]>big){
                    big=arr[i][j];
                    row=i+1;
                    col=j+1;
                }
            }
        }

        System.out.println(big);
        System.out.println(row + " " + col);
    }

}
