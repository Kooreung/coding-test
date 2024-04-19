import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] strArr = str.split("");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[a-z]")) {
                sb.append(strArr[i].toUpperCase());
            } else if (strArr[i].matches("[A-Z]")) {
                sb.append(strArr[i].toLowerCase());
            }
        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}