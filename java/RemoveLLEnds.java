import java.util.LinkedList;

public class RemoveLLEnds {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("FOUR");
        list.add("FIVE");
        list.add("SIX");
        list.add("SEVEN");

        System.out.println(list);      //Output : [ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN]

        list.poll();
        list.pollFirst();
        list.remove();
        list.removeFirst();

        System.out.println(list);     //Output : [FIVE, SIX, SEVEN]

        list.pollLast();
        list.removeLast();

        System.out.println(list);     //Output : [FIVE]
    }
}