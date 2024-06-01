import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] n = new int[4];
        for (int i = 0; i < 4; i++) {
            n[i] = Integer.parseInt(st.nextToken());
        }

        int[] nArr = Arrays.stream(n).sorted().toArray();
        int teamA = nArr[0] + nArr[3];
        int teamB = nArr[1] + nArr[2];
        int compare = teamA - teamB;

        System.out.println(Math.abs(compare));

        br.close();
    }
}