import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());
        int A = 0;
        int B = 0;
        boolean sw = false;

        for (int i = 0; i <= sum; ++i) {
            for (int j = sum; j >= 0; --j) {
                A = i;
                B = j;

                if (A + B == sum && A - B == sub) {
                    System.out.println(A + " " + B);
                    sw = true;
                    break;
                }
            }
        }

        if (sw == false) {
            System.out.println(-1);
        }

        br.close();
    }
}