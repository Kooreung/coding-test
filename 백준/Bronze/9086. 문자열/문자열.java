import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String testCase = br.readLine();

            bw.write(testCase.charAt(0) + "" + testCase.charAt(testCase.length() - 1) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}