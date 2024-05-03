import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] burgerPrice = new int[3];
        int[] drinkPrice = new int[2];
        burgerPrice[0] = Integer.parseInt(br.readLine());
        burgerPrice[1] = Integer.parseInt(br.readLine());
        burgerPrice[2] = Integer.parseInt(br.readLine());
        drinkPrice[0] = Integer.parseInt(br.readLine());
        drinkPrice[1] = Integer.parseInt(br.readLine());

        int setPrice = 4000;

        for (int i = 0; i < burgerPrice.length; i++) {
            for (int j = 0; j < drinkPrice.length; j++) {
                if (setPrice > (burgerPrice[i] + drinkPrice[j] - 50)) {
                    setPrice = burgerPrice[i] + drinkPrice[j] - 50;
                }
            }
        }

        System.out.println(setPrice);

        br.close();
    }
}