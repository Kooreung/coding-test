import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int count = 1;

        for (int i = 1; i <= N; i++) {
            count *= i;
        }

        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}