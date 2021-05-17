import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String in lowercase");
        String str = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
    }
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.get(c)==1)
                System.out.println(c);
        }
    }
}
