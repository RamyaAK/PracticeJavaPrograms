import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = scanner.nextLine();

        boolean isPalindrome= true;

        int j = str.length()-1;
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome = false;
            }
        }
         System.out.println("The string is a "+isPalindrome);
    }
}
