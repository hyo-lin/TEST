package Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1085 {
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());


        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int x_axisMin = findMin(x, w-x);
        int y_axisMin = findMin(y, h-y);

        System.out.println(y_axisMin > x_axisMin ? x_axisMin : y_axisMin);

    }
    static int findMin(int m, int n){
        if(m >= n){
            return n;
        }else{
            return m;
        }}
}
