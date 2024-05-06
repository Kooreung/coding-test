import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = String.valueOf(A * B * C);
        int[] count = new int[10];

        for (int i = 0; i < result.length(); i++) {
            count[Character.getNumericValue(result.charAt(i))]++;
        }

        br.close();
        for (int i : count) {
            System.out.println(i);
        }
    }
}