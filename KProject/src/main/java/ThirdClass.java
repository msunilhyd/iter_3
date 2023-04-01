public class ThirdClass {

    public static void main(String[] args) {

        System.out.println(sumOf2Numbers(2, 3));
        System.out.println(diffOf2Nums(10, 4));
        System.out.println(prodOf2Nums(2, 4));
        System.out.println(divOf2Nums(10, 5));
        System.out.println(remainderOfDiv(9, 2));
    }

    // Method for the remainder when a/b
    public static int remainderOfDiv(int a, int b) {
        return a % b;
    }

    // Method for 4/2 = 2, division
    public static int divOf2Nums(int a, int b) {
        return a / b;
    }

    // Method for product of 2 numbers
    public static int prodOf2Nums(int a, int b) {
        return a * b;
    }

    // Method for difference of 2 numbers
    public static int diffOf2Nums(int a, int b) {
        return a - b;
    }

    // Method for sum of 2 numbers
    public static int sumOf2Numbers(int a, int b) {
        return a + b;
    }
}
