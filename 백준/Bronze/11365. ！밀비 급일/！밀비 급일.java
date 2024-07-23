import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String st = br.readLine();
            if (st.equals("END")) {
                break;
            } else {
                for (int i = st.length() - 1; i >= 0; i--) {
                    bw.write(st.charAt(i));
                }
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}