public class SomeClass {

    public static void main(String[] args) {

        boolean[] bArr = {true, false, false, true, true};
        char[] cArr = {'a', '%', '+', 'b'};
        String[] stringArr = {"Sunil", "Sudheer", "Manoj", "Prash"};

        for(int i=0; i<bArr.length; i++) {
            System.out.println(stringArr[i]);
            System.out.println(bArr[i]);
            System.out.println(cArr[i]);
        }

        int[] a = {4, 7, 1, 9};
        // The maximum index value can only be = 3
        // For any array of length l, max index = l-1
//        for (int i=0; i<a.length; i++) {
//            System.out.println(a[i]);
//        }
       // printMyName();
    }

    // Write a method that prints your name 500 times
    public static void printMyName() {

        for (int i=0; i<6; i++) {
            System.out.println("Sunil");
        }
    }
}
