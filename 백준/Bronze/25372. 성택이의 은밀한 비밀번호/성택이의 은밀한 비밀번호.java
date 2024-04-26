import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.length() >= 6 && str.length() <= 9) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}