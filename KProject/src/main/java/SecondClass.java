public class SecondClass {

    public static void main(String[] args) {
        String str = helloPlusName("Sunil");
        System.out.println(str);
    }

    public static String helloPlusName(String s) {
        return "Hello " + s;
    }

    public static String returnHelloWorld() {
        return "Hello World";
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }
}
