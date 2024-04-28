import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int resultA = 0;
        int resultB = 1;
        int resultC = 0;

        for (int i = 1; i <= n; i++) {
            resultA += i;
        }
        resultB = resultA * resultA;

        for (int i = 1; i <= n; i++) {
            resultC += i * i * i;
        }

        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        br.close();
    }
}