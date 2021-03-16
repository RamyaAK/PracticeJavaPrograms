import java.util.Scanner;

public class DuplicateCharactersInAString {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Pls Enter the String with Duplicate Chars");
        String str = sc.nextLine();

        char charArray[] = str.toLowerCase().toCharArray();
        int count;

        //logic: Linear search in array
        for(int i =0; i<charArray.length;i++){
            count = 1;
            for(int j = i+1; j<charArray.length;j++){
                if(charArray[i]==charArray[j] && charArray[i]!=' '){
                    count = count+1;
                    charArray[j]=0;
                }
            }
            if(count>1 && charArray[i]!= 0){
                System.out.println(charArray[i]+" is repeating for "+count+" times");
            }
        }
    }
}
