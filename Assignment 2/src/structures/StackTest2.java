package structures;

import java.util.List;

public class StackTest2 {

    public static void main(String[] args){
        System.out.println("Stack Test 2");
        MyStack stack = new MyStack();

        System.out.println("\nAdded Elements");
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(1);

        System.out.println("\nRemove Element @ Head");
        System.out.println(stack.pop());

        System.out.println("\nGet Element @ Head");
        System.out.println(stack.peek());

        System.out.println("\nT or F: Is Stack Empty?");
        System.out.println(stack.isEmpty());

        System.out.println("\nSize of Stack");
        System.out.println(stack.size());

        System.out.println("\nCovert Stack to a List");
        List stackList = stack.asList();
        for(int i = 0; i < stackList.size (); i++){
            System.out.println(stackList.get(i));
        }

    }
}
