import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sumA = 0;
        int sumB = 0;
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            sumA += Integer.parseInt(stA.nextToken());
            sumB += Integer.parseInt(stB.nextToken());
        }

        System.out.println(Math.max(sumA,sumB));
        br.close();
    }
}