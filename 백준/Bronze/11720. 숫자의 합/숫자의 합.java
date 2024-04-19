import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        String str = br.readLine();
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            sum += Integer.parseInt(strArr[i]);
        }

        System.out.println(sum);
        br.close();
    }
}