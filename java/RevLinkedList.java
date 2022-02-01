import java.util.Collections;
import java.util.LinkedList;

public class RevLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(56);
        list.add(67);
        list.add(81);
        list.add(41);
        list.add(63);
        list.add(21);
        list.add(96);

        System.out.println("LinkedList Before Reverse :");
        System.out.println(list);

        Collections.reverse(list);

        System.out.println("LinkedList After Reverse :");
        System.out.println(list);
    }
}