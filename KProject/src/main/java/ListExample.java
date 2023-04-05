import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // Array is of fixed size
        //
        // List
        List<String>  myList = new ArrayList<String>();
        myList.add("Hyd");
        myList.add("Delhi");
        myList.add("Blr");

//        System.out.println(myList);
        List<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(9);
        myIntList.add(8);
        myIntList.add(0);

        myList.add(0, "Bombay");

        System.out.println(myList);
    }
}
