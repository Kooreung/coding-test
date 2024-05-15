import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] stAArr = new int[6];
            for (int j = 0; j < stAArr.length; j++) {
                stAArr[j] = Integer.parseInt(st.nextToken());
            }
            int[] time = new int[3];
            time[0] = stAArr[3] - stAArr[0];
            time[1] = stAArr[4] - stAArr[1];
            time[2] = stAArr[5] - stAArr[2];

            if (time[2] < 0) {
                time[2] = 60 + time[2];
                time[1]--;
            }

            if (time[1] < 0) {
                time[1] = 60 + time[1];
                time[0]--;
            }

            bw.write(time[0] + " " + time[1] + " " + time[2] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}