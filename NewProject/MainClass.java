public class MainClass {

    public static void main(String[] args) {

        int[] a = {3, 4, 3, 0};
        String[] strArr = {"This", "is", "Snil"};
        char[] charArr = {'a', 'v'};
        boolean[] boolArr = {true, false, true, true};
        double[] dArr = {0.2, 9.222, 9.4};

        String someStr = "kanpur";

        // a program that prints 3 times of the first 3 chars of a String

        String s = someStr.substring(0, 3);
        System.out.println(s + s + s);

        String otherString = "Kanpur";

        System.out.println(someStr.equals(otherString));
        System.out.println(someStr.equalsIgnoreCase(otherString));
    }
}
