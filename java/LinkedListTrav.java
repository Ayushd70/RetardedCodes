import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTrav {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Geeks");
        linkedList.add("For");
        linkedList.add("Geek");
        linkedList.add("2020");
        linkedList.add("2021");

        Iterator<String> iterator = linkedList.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
