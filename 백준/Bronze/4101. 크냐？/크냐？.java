import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A;
        int B;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            } else if (A <= B) {
            System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}