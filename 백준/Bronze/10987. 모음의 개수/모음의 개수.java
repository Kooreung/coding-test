import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[aeiou]")) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}