import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

    }

    public static Boolean parenthesesCheck(String s) {
        if (s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') {
            int track = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') track += 1;
                if (s.charAt(i) == ')') track -= 1;
            }
            if (track == 0) return true;
            return false;
        }
        return false;
    }

    public static String reverseInteger(int str) {
        String digits = Integer.toString(str);
        String backwards = "";
        for (int i = digits.length() - 1; i >= 0; i -= 1) backwards += digits.charAt(i);
        return backwards;
    }

    public static String encryptThis(String str) {
        String final_encrypted = "";
        String[] words = str.split(" ");
        for (String s : words) {
            String encrypted = "";
            int first_int = Character.codePointAt(String.valueOf(s.charAt(0)), 0);
            String first = Integer.toString(first_int);
            char secnd = s.charAt(s.length() - 1);
            char last = s.charAt(1);
            encrypted += first;
            encrypted += secnd;
            String sRest = s.substring(2, s.length() - 1);
            for (int i = 0; i < sRest.length(); i++) {
                encrypted += sRest.charAt(i);
            }
            encrypted += last;
            final_encrypted = final_encrypted + encrypted + " ";
        }
        return final_encrypted;
    }


    public static String decipherThis(String str) {
        String deciphered_entire = "";
        String[] words = str.split(" ");
        for (String word : words) {
            String deciphered_word = "";
            char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            String charCode = "";
            int lettsBegin = 0;
            for (int i = 0; i < word.length(); i++) {
                for (char c : nums) {
                    if (word.charAt(i) == c) {
                        charCode += c;
                        lettsBegin = i + 1;
                    }
                }
            }
            int charCode_int = Integer.parseInt(charCode);
            char firstLett = (char) charCode_int;
            deciphered_word += firstLett;
            deciphered_word += word.charAt(word.length() - 1);
            for (int i = lettsBegin + 1; i < word.length() - 1; i++) deciphered_word += word.charAt(i);
            deciphered_word += word.charAt(lettsBegin);
            if (words[words.length - 1].equals(word)) deciphered_entire += deciphered_word;
            else deciphered_entire += deciphered_word + " ";
        }
        return deciphered_entire;
    }

}