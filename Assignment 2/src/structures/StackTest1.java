package structures;

import interfaces.IndexableList;

import java.util.List;
import java.util.ArrayList;

public class StackTest1 {

    public static void main(String[] args){
        System.out.println("Stack Test 1");
        MyStack stack = new MyStack();

        System.out.println("\nAdded Elements");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(60);

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
