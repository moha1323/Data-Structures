package structures;

public class StackListTest {
    public static void main(String[] args){
        StackList stack = new StackList();
        System.out.println("Adding elements to Stack");
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(6);

        System.out.println("\nDisplay Value @ Top");
        System.out.println(stack.peek());
        System.out.println("\nDisplay Size of Stack");
        System.out.println(stack.size());

        System.out.println("\nRemove Value @ Top");
        System.out.println(stack.pop());

        System.out.println("\nDisplay Value @ Top");
        System.out.println(stack.peek());
        System.out.println("\nDisplay Size of Stack");
        System.out.println(stack.size());

    }
}
