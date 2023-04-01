public class ExClass {

    public static void main(String[] args) {
        System.out.println(isOdd(9));
        System.out.println(isEven(4));
    }

    public static boolean isEven(int n) {
        if (n%2 != 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOdd(int n) {
        if (n%2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
