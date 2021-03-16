import java.util.Arrays;
import java.util.Scanner;

public class AnagramsOrNot {
    public static void main(String args[]){
        // To check if 2 strings contains same chars or not irrespective of their position- Anagrams Ex: listen, silent

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter first String");
        String str1 = scanner.nextLine();
        System.out.println("Pls enter second String");
        String str2 = scanner.nextLine();

        // convert both the strings to char array

        char[] arrStr1 = str1.toLowerCase().toCharArray();
        char[] arrStr2 = str2.toLowerCase().toCharArray();

        // sort both the arrays using Array's builtIn mtd sort

        Arrays.sort(arrStr1);
        Arrays.sort(arrStr2);

        // Compare and print true or false

        System.out.println("Are both Strings Anagrams?"+(Arrays.equals(arrStr1, arrStr2)));
    }
}
