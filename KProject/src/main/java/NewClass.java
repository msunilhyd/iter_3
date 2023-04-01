public class NewClass {

    public static void main(String[] args) {

        // || = Logical OR
        // && = Logical AND
        System.out.println(areWePartying(true, false));
        System.out.println(areWePartying(false, true));
        System.out.println(areWePartying(false, false));
        System.out.println(areWePartying(true, true));
    }

    // returns true if we are partying
    // We party if it is a weekend and if we have more than 100 Dollars
    public static boolean areWePartying(boolean weekend, boolean moreThan100) {
        if (weekend == true && moreThan100 == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
