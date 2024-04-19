import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T  = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            StringBuilder sum = new StringBuilder();

            for (int i = 1; i <= S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    st = new StringTokenizer(S.substring(i - 1, i));

                    sum.append(st.nextToken());
                }
            }
            System.out.println(sum);
        }
        br.close();
    }
}