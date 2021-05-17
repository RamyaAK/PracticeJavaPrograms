// Java Program to reverse a String
// without using inbuilt String function

import java.util.regex.Pattern;

public class ReverseWordsOrder {

    // Method to reverse words of a String
    static String reverseWords(String str) {

        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");

        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        // is whitespace and store in words array.
        String[] words = pattern.split(str);
        String result = "";

        // Iterate over the words array and store
        // the string in reverse order.
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                result = words[i] + result;
            else
                result = " " + words[i] + result;
        }
        return result;
    }

    // Driver methods to test above method
    public static void main(String[] args) {
        String s1 = "Im learning java";
        System.out.println(reverseWords(s1));

        String s2 = "I love Java Programming";
        System.out.println(reverseWords(s2));
    }
}

