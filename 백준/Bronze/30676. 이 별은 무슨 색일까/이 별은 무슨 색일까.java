import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        if (A <= 780 && A >= 620) {
            System.out.println("Red");
        } else if (A >= 590 && A <= 619) {
            System.out.println("Orange");
        } else if (A >= 570 && A <= 589) {
            System.out.println("Yellow");
        } else if (A >= 495 && A <= 569) {
            System.out.println("Green");
        } else if (A >= 450 && A <= 494) {
            System.out.println("Blue");
        } else if (A >= 425 && A <= 449) {
            System.out.println("Indigo");
        } else if (A >= 380 && A <= 424) {
            System.out.println("Violet");
        }
        
        br.close();
    }
}