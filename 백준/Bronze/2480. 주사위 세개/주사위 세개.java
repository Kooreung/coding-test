import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int price = 0;
        int[] diceArray = {dice1, dice2, dice3};
        int highestDice = diceArray[0];

        if (dice1 == dice2 && dice2 == dice3) {
            price = 10000 + (dice1 * 1000);
        } else if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
            for (int i : diceArray) {
                if (i > highestDice) {
                    highestDice = i;
                }
            }
            price = highestDice * 100;
        } else if (dice1 == dice2) {
            price = 1000 + (dice1 * 100);
        } else if (dice2 == dice3) {
            price = 1000 + (dice2 * 100);
        } else if (dice1 == dice3) {
            price = 1000 + (dice1 * 100);
        }

        System.out.println(price);
    }
}
