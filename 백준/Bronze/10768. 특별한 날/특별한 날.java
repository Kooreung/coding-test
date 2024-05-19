import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        if (A == 2) {
            if (B == 18) {
                System.out.println("Special");
            } else if (B > 18) {
                System.out.println("After");
            } else {
                System.out.println("Before");
            }
        } else if (A > 2) {
            {
                System.out.println("After");
            }
        } else {
            System.out.println("Before");
        }

        br.close();
    }
}