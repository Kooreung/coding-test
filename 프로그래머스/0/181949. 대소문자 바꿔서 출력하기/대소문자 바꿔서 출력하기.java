import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        String[] strArr = a.split("");
        
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].matches("[a-z]")) {
                result += strArr[i].toUpperCase();
            } else {
                result += strArr[i].toLowerCase();
            }
        }
        
        System.out.println(result);
    }
}