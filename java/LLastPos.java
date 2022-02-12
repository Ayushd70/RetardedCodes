import java.util.LinkedList;

public class LLastPos
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("CCC");
        linkedList.add("BBB");
        linkedList.add("FFF");
        linkedList.add("BBB");

        System.out.println(linkedList);       //Output : [AAA, BBB, CCC, BBB, FFF, BBB]

        System.out.println(linkedList.lastIndexOf("BBB"));    //Output : 5
    }
}