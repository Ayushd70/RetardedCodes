import java.util.LinkedList;

public class LinkLiAsStack
{
    public static void main(String[] args)
    {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);      //Output : [40, 30, 20, 10]

        //Popping out the elements from the stack
        System.out.println(stack.pop());    //Output : 40
        System.out.println(stack.pop());    //Output : 30
    }
}