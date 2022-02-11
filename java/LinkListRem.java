import java.util.LinkedList;

public class LinkListRem
{
    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        System.out.println(linkedList);       //Output : [10, 20, 30, 40, 50]

        linkedList.clear();
        System.out.println(linkedList);      //Output : []
    }
}