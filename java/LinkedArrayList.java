import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("ONE");
        linkedList.add("TWO");
        linkedList.add("THREE");
        linkedList.add("FOUR");
        linkedList.add("FIVE");
        System.out.println(linkedList);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("SIX");
        arrayList.add("SEVEN");
        arrayList.add("EIGHT");
        arrayList.add("NINE");
        System.out.println(arrayList);

        linkedList.addAll(arrayList);
        System.out.println(linkedList);     //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE]
    }
}