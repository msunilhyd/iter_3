package session10;

public class MainClass {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Exception occured");
        }

        System.out.println("Hello World");
    }
}
