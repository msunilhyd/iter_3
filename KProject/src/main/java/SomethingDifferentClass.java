public class SomethingDifferentClass {
    public static void main(String[] args) {
        String s = "sunil";
        String k = "kumar";
        System.out.println(return3TimesFirst3Chars(k));
    }
    // Write a method that returns 3 times the first 3 chars of a string
    //sunil
    //return sunsunsun
    public static String return3TimesFirst3Chars(String s) {
        String str = s.substring(0, 4);
        return str + str + str;
    }
}
