import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        long result = 0;

        for (int i = 0; i < N.length(); i++) {
            result = (result * 10 + (N.charAt(i) - '0')) % 20000303;
        }

        System.out.println(result);

        br.close();
    }
}