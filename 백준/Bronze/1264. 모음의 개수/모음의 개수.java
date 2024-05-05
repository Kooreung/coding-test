import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            int count = 0;
            String str = br.readLine().toLowerCase();
            String[] strArr = str.split("");
            for (String search : strArr) {
                switch (search) {
                    case "a", "e", "i", "o", "u":
                        count++;
                        break;
                }
            }
            if (!str.equals("#")) {
                bw.write(count + "\n");
            } else {
                break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}