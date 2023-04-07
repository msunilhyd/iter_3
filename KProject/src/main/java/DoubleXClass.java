public class DoubleXClass {

    public static void main(String[] args) {

        System.out.println(doubleX("xaxxx"));
    }

    public static boolean doubleX(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            String firstX = str.substring(i, i + 1);
            if (firstX.equals("x")) {
                String secondX = str.substring(i + 1, i + 2);
                if (secondX.equals("x")) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
