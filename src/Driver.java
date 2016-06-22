public class Driver {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println("Stack is empty?\n" + stack.empty());
        stack.push("1");
        stack.push("22");
        stack.push("333");
        stack.push("4444");
        stack.push("55555");
        System.out.println("Top item is " + stack.peek());
        stack.pop();
        System.out.println("Print Stack");
        stack.printStack();
    }

}
