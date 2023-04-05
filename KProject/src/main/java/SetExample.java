import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Array, List, Map, Set
        // Set stores only unique elements
        // Ctrl + space
        Set<String> mySet = new HashSet<>();
        mySet.add("lion");
        mySet.add("tiger");
        mySet.add("dove");
        mySet.add("lion");

        System.out.println(mySet);
    }
}
