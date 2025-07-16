package Simhwa;

import java.io.*;


public class _2444 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());

        for(int i=1; i<=num; i++){
            for(int j=0; j<num-i; j++){
                bw.write(' ');
            }
            for(int k=0; k<i*2-1; k++){
                bw.write('*');
            }
            bw.newLine();
        }
//        i = 4일 때 → 공백 1, 별 7개
//        공백 기간을 왼->오
//        i = 3일 때 → 공백 2, 별 5개
        for(int i=num-1; i>=0; i--){
            for(int j=0; j<num-i; j++){
                bw.write(' ');
            }
            for(int k=0; k<i*2-1; k++){
                bw.write('*');
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();



    }

}
