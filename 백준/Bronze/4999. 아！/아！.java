import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String B = br.readLine();
        String[] AList = A.split("");
        String[] BList = B.split("");

        int ACount = 0;
        int BCount = 0;

        for (int i = 0; i < AList.length; i++) {
            if (AList[i].equals("a")) {
                ACount++;
            }
        }
        for (int i = 0; i < BList.length; i++) {
            if (BList[i].equals("a")) {
                BCount++;
            }
        }
        if (ACount >= BCount) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }

        br.close();
    }
}