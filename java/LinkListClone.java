import java.util.LinkedList;

public class LinkListClone {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.add(10);
        linkedList1.add(20);
        linkedList1.add(30);
        linkedList1.add(40);
        linkedList1.add(50);

        System.out.println(linkedList1);       //Output : [10, 20, 30, 40, 50]

        LinkedList<Integer> linkedList2;
        linkedList2 = (LinkedList<Integer>) linkedList1.clone();

        System.out.println(linkedList2);     //Output : [10, 20, 30, 40, 50]
    }
}