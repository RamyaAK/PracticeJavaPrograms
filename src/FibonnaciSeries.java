import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pls Enter a number");
        int n = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
