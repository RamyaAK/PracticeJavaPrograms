import java.util.HashMap;
import java.util.Scanner;

public class CharacterCountInAString {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();


        System.out.println("Pls enter your string in which we need to search for a character");
        String str = scanner.nextLine();
        // str = str.toLowerCase();

        char[] charArray = str.replaceAll("\\s", "").toCharArray();

        for (char ch : charArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println("Occurrence of each character in your string is " + map);
    }
}
