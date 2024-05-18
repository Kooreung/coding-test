import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        
        if (A == 60 && B == A && C == A) {
            System.out.println("Equilateral");
        } else if (A + B + C == 180 && (A == B || B == C || A == C)) {
            System.out.println("Isosceles");
        } else if (A + B + C == 180 && (A != B || B != C || A != C)) {
            System.out.println("Scalene");
        } else {
            System.out.println("Error");
        }

        br.close();
    }
}