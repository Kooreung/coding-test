import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] science = new int [4];
        int[] society = new int [2];

        for (int i = 0; i < science.length; i++) {
            science[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < society.length; i++) {
            society[i] = Integer.parseInt(br.readLine());
        }

        int[] sortedScience = Arrays.stream(science).sorted().toArray();
        int[] sortedSociety = Arrays.stream(society).sorted().toArray();
        
        int sum = 0;
        for (int i = sortedScience.length - 1; i > sortedScience.length - 4; i--) {
            sum += sortedScience[i];
        }
        for (int i = sortedSociety.length - 1; i > sortedSociety.length - 2; i--) {
            sum += sortedSociety[i];
        }

        System.out.println(sum);
        br.close();
    }
}