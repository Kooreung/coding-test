import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        String[] stArr = st.trim().split(" ");

        if (st.isEmpty() || st.isBlank()) {
            System.out.println(0);
        } else {
            System.out.println(stArr.length);
        }
    }
}