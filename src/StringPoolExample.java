public class StringPoolExample {

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "apple";
        String s3 = new String("apple");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        String s4 = s2;
        String s5 = "apple";
        String s6 = new String("apple");

        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));

        System.out.println(s5.equals(s6));
        System.out.println(s5==s6);



    }
}
