import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[5];
        int sum = 0;

        for (int i = 0; i <= 4; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            sum += numArr[i] * numArr[i];
        }

        bw.write((sum % 10) + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}