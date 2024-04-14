import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lowerComparison = arr[0];
        int higherComparison = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (lowerComparison > arr[i]) {
                lowerComparison = arr[i];
            }
            if (higherComparison < arr[i]) {
                higherComparison = arr[i];
            }
        }

        bw.write(lowerComparison + " " + higherComparison + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}