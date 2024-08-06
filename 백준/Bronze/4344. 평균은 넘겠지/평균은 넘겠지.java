import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int c = Integer.parseInt(br.readLine());
        double result = 0.000;

        for(int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int[] b = new int [a];
            int sum = 0;
            int avg = 0;
            for(int j = 0; j < a; j++) {
                b[j] = Integer.parseInt(st.nextToken());
                sum += b[j];
            }
            avg = sum / a;

            int count = 0;
            for(int j : b) {
                if( j > avg) {
                    count++;
                }
            }
            result = (double) count / a * 100;
            bw.write(String.format("%.3f%%\n", result));
        }

        bw.flush();
        br.close();
        bw.close();
    }
}