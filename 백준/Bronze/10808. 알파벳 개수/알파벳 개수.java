import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabetArr = new int[26];
        String str = br.readLine();
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            switch (strArr[i]) {
                case "a" : alphabetArr[0]++;
                    break;
                case "b" : alphabetArr[1]++;
                    break;
                case "c" : alphabetArr[2]++;
                    break;
                case "d" : alphabetArr[3]++;
                    break;
                case "e" : alphabetArr[4]++;
                    break;
                case "f" : alphabetArr[5]++;
                    break;
                case "g" : alphabetArr[6]++;
                    break;
                case "h" : alphabetArr[7]++;
                    break;
                case "i" : alphabetArr[8]++;
                    break;
                case "j" : alphabetArr[9]++;
                    break;
                case "k" : alphabetArr[10]++;
                    break;
                case "l" : alphabetArr[11]++;
                    break;
                case "m" : alphabetArr[12]++;
                    break;
                case "n" : alphabetArr[13]++;
                    break;
                case "o" : alphabetArr[14]++;
                    break;
                case "p" : alphabetArr[15]++;
                    break;
                case "q" : alphabetArr[16]++;
                    break;
                case "r" : alphabetArr[17]++;
                    break;
                case "s" : alphabetArr[18]++;
                    break;
                case "t" : alphabetArr[19]++;
                    break;
                case "u" : alphabetArr[20]++;
                    break;
                case "v" : alphabetArr[21]++;
                    break;
                case "w" : alphabetArr[22]++;
                    break;
                case "x" : alphabetArr[23]++;
                    break;
                case "y" : alphabetArr[24]++;
                    break;
                case "z" : alphabetArr[25]++;
                    break;
            }
        }

        for (int i = 0; i < alphabetArr.length; i++) {
            System.out.print(alphabetArr[i] + " ");
        }

        br.close();
    }
}