public class FourthClass {

    public static void main(String[] args) {

        System.out.println(areWePartying(true, true));
        System.out.println(areWePartying(true, false));
        System.out.println(areWePartying(false, true));
        System.out.println(areWePartying(false, false));
    }

    // return true if we are partying
    // we are partying if it is a weekend or it is a festival
    public static boolean areWePartying(boolean weekend, boolean festival) {
        if (weekend == true || festival == true) {
            return true;
        } else {
            return false;
        }
    }
}
