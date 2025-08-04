import java.util.Stack;
public class allstack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("elements: "+ stack);
        System.out.println("size: " + stack.size());
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("After removing stack:"+stack);
        System.out.println("size after pop: " + stack.size());
        System.out.println("Is stack empty: "+ stack.isEmpty());
        System.out.println("Search the element 20: "+stack.search(20));
    }
}
