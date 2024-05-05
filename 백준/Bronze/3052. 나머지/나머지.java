import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = Integer.parseInt(br.readLine()) % 42;
        }
        int[] numberDistinct = Arrays.stream(number).distinct().toArray();

        System.out.println(numberDistinct.length);

        br.close();
    }
}