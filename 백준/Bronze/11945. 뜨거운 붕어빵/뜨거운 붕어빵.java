import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String str;

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            for (int j = str.length() - 1; j >= 0; j--) {
                bw.write(str.charAt(j));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}