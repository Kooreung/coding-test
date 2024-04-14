import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(br.readLine());
        int count = 0;

        while (st.hasMoreTokens()) {
            if(Integer.parseInt(st.nextToken()) == v) {
                count++;
            }
        }

        System.out.println(count);

        br.close();
        bw.flush();
        bw.close();
    }
}