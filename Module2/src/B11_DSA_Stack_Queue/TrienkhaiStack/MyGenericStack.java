package B11_DSA_Stack_Queue.TrienkhaiStack;

public class MyGenericStack extends GenericStackClient {
    private static void stackOfIStrings() {
        GenericStackClient<String> stack = new GenericStackClient<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
    }
}
