import java.util.ArrayList;
import java.util.List;

public class OtherClass {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();

        myList.add(3);
        myList.add(9);
        myList.add(4);

        System.out.println(myList.get(1));
        System.out.println(myList.size());
        System.out.println(myList);
    }
}
