import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] posArr = new int[26];

        for (int i = 0; i < posArr.length; i++) {
            posArr[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            int index = ch - 'a';

            if (posArr[index] == -1) {
                posArr[index] = i;
            }
        }

        br.close();
        for (int i : posArr) {
            System.out.print(i + " ");
        }
    }
}