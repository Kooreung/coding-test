class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] str = letter.split(" ");
        String[] morse = {
                ".-","-...","-.-.","-..",
                ".","..-.","--.","....",
                "..",".---","-.-",".-..",
                "--","-.","---",".--.",
                "--.-",".-.","...","-",
                "..-","...-",".--","-..-",
                "-.--","--.."};

        for (String word : str) {
            if (word.equals(".-")) answer += "a";
            if (word.equals("-...")) answer += "b";
            if (word.equals("-.-.")) answer += "c";
            if (word.equals("-..")) answer += "d";
            if (word.equals(".")) answer += "e";
            if (word.equals("..-.")) answer += "f";
            if (word.equals("--.")) answer += "g";
            if (word.equals("....")) answer += "h";
            if (word.equals("..")) answer += "i";
            if (word.equals(".---")) answer += "j";
            if (word.equals("-.-")) answer += "k";
            if (word.equals(".-..")) answer += "l";
            if (word.equals("--")) answer += "m";
            if (word.equals("-.")) answer += "n";
            if (word.equals("---")) answer += "o";
            if (word.equals(".--.")) answer += "p";
            if (word.equals("--.-")) answer += "q";
            if (word.equals(".-.")) answer += "r";
            if (word.equals("...")) answer += "s";
            if (word.equals("-")) answer += "t";
            if (word.equals("..-")) answer += "u";
            if (word.equals("...-")) answer += "v";
            if (word.equals(".--")) answer += "w";
            if (word.equals("-..-")) answer += "x";
            if (word.equals("-.--")) answer += "y";
            if (word.equals("--..")) answer += "z";
        }
        
        return answer;
    }
}