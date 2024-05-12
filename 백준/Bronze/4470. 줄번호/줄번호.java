import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String M = br.readLine();
            bw.write(i + 1 + ". " + M + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}