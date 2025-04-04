package For;

import java.io.*;

class _15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = bf.readLine().split(" "); // split() 한 번만 호출
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            bw.write("Case"+" #"+(i+1)+": "+(a + b) + "\n");
        }

        bw.flush();
        bw.close(); // 자원 해제
    }
}
