import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int avgA;
        int avgB;

        if(A % C >= 1) {
            avgA = A / C + 1;
        } else {
            avgA = A / C;
        };

        if(B % D >= 1) {
            avgB = B / D + 1;
        } else {
            avgB = B / D;
        };

        if (avgA > avgB) {
            System.out.println(L - avgA);
        } else {
            System.out.println(L - avgB);
        }
        
        br.close();
    }
}