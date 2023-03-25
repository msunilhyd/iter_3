public class SomeClass {

    public static void main(String[] args) {

        System.out.println(canFly(true));
        System.out.println(canFly(false));

    }

    public static boolean canFly(boolean hasWings) {
        if (hasWings == true) {
            return true;
        } else {
            return false;
        }
    }

    public static int getProduct(int a, int b) {
        return a*b;
    }
}
