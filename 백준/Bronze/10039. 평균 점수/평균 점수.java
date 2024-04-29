import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        int avg = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 40) {
                arr[i] = 40;
            }
            sum += arr[i];
        }
        avg = sum / 5;
        br.close();

        System.out.println(avg);
    }
}