import java.util.Scanner;

public class ArraysBasic {
        public static void main (String[] args)
        {
            // declares an Array of integers.
            int[] arr;
            int[] marks = { 125, 132, 95, 116, 110 };

            // allocating memory for 5 integers.
            arr = new int[5];

            Scanner sc = new Scanner(System.in);
            // initializing the elements of the specified array
            System.out.println("Enter 5 elements\n");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }


            // accessing the elements of the specified array
         for (int i = 0; i < arr.length; i++)
                System.out.println("Element at index " + i + " : " + arr[i]);

         for (int i : arr)
                System.out.println("Element at index " + i + " : " + arr[i]);
        }

    }
