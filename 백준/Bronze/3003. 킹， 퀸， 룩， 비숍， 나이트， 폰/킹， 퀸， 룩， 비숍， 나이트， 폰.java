import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] test = new int[6];
        for (int i = 0; i < test.length; i++) {
            test[i] = Integer.parseInt(st.nextToken());
        }

        int[] pieces = {1, 1, 2, 2, 2, 8};
        int[] compare = new int[6];

        for (int i = 0; i < compare.length; i++) {
            compare[i] = pieces[i] - test[i];
        }

        for (int i = 0; i < compare.length; i++) {
            System.out.print(compare[i] + " ");
        }
    }
}