import java.util.Scanner;

public class StringReverse {

    public static void reverseUsingBuilder(String[] words) {
        String reversedString = " ";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reversedString += sb.toString() + " ";
        }
        System.out.println(reversedString);
    }

    public static void reverseUsingArray(char[] wordsArray) {
        for (int i = wordsArray.length - 1; i >= 0; i--) {
            System.out.print(wordsArray[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to be reversed");
        String str = scanner.nextLine();

        String words[] = str.split("\\s");
        char[] wordsArray = str.replaceAll("\\s", "").toCharArray();

        reverseUsingBuilder(words);
        reverseUsingArray(wordsArray);

    }
}
