import java.util.ArrayList;
import java.util.Collections;

public class RevArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("Gold");
        list.add("Iron");
        list.add("Copper");
        list.add("Silver");
        list.add("Nickel");
        list.add("Cobalt");
        list.add("Zinc");

        System.out.println("ArrayList Before Reverse :");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("ArrayList After Reverse :");
        System.out.println(list);
    }
}