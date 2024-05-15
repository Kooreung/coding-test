import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            if (sum == 0) {
                break;
            } else {
                bw.write(String.valueOf(sum) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}