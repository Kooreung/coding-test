import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = br.readLine();
        char ch = st.charAt(0);
        int num = ch;
        bw.write(num + "");

        br.close();
        bw.flush();
        bw.close();
    }
}