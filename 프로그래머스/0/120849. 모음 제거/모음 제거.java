class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowel = {"a", "e", "i", "o", "u"};
        String[] stringArray = my_string.split("");

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (stringArray[i].equals(vowel[j])) {
                    my_string = my_string.replace(vowel[j], "");
                }
            }
        }

        answer = my_string;
        
        return answer;
    }
}