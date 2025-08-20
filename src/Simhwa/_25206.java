package Simhwa;

import java.io.*;
import java.util.StringTokenizer;


public class _25206 {
    public static void main(String[] args) throws IOException {

        double totalpoints = 0;
        double totalcredit = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("P")) {
                continue;
            }
            double point = gettotal(grade);
            totalpoints += credit * point;
            totalcredit += credit;

        }
        System.out.printf("%.6f\n", totalpoints / totalcredit);
    }

    public static double gettotal(String grade){
        switch(grade){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F" : return 0.0;
            default : return 0.0;
        }
    }


}






