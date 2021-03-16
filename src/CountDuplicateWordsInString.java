import java.util.HashMap;
import java.util.Scanner;

public class CountDuplicateWordsInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = scanner.nextLine();

        String [] words = str.toLowerCase().split(" ");

        HashMap<String, Integer> hm = new HashMap<>();

        for(String s:words){
            if(hm.containsKey(s)){
                hm.put(s,hm.get(s)+1);
            }
            else {
                hm.put(s,1);
            }
        }
        System.out.println(hm);
    }
}
