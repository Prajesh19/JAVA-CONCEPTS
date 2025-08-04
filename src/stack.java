import java.util.Stack;
import java.util.*;
public class stack {
    int top;
    int[] arr;
    int size;

    stack(int n) {
        size = n;
        arr = new int[size];
        top = -1;
    }

    public void push(int val) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        }
        arr[++top] = val;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        }
        return arr[top--];
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top==-1) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
      stack stk = new stack(10);
      stk.push(10);
      stk.push(4);
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());
    }
}

