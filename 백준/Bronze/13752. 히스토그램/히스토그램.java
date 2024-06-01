import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                bw.write('=');
            }
            bw.write('\n');
        }

        br.close();
        bw.flush();
        bw.close();
    }
}