package ex3.generics.stack.diy;

import ex3.generics.stack.Stack;

public class TestDrive {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(new Object());
        stack.push("a");
        stack.push(1);
        stack.push(1);

        System.out.println(stack);

//        Stack<int> intStack = new Stack<int>(3);
        ex3.generics.stack.Stack<Integer> intStack = new Stack<>(3);

//        intStack.push("a");
//        intStack.push(new Object());
        intStack.push(1);
        intStack.push(1);
        intStack.push(1);
        intStack.push(1);
        System.out.println(intStack);
    }
}
