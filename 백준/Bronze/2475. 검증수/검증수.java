import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[5];
        int sum = 0;

        for (int i = 0; i <= 4; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            sum += numArr[i] * numArr[i];
        }

        System.out.println(sum % 10);
        br.close();
    }
}