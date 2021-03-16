import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls Enter a Number greater than 0");
        int n = scanner.nextInt();


        int fact =1;

        if(n>0){
            for(int i=1; i<=n; i++){
                fact = fact * i;
            }
            System.out.println("Factorial of a number is "+fact);
    }
        else{
            System.out.println("Factorial of zero is "+fact);
        }
    }
}
