import java.util.*;
public class stack1 {
    int top;
    int[] arr;
    int size;

    stack1(int n ){
        size = n;
        arr = new int[size];
        top =-1;
    }
    public void push(int val){
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        arr[++top]= val;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        }
        return arr[top--];
    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        stack1 obj = new stack1(size);
        for(int i=0;i<size;i++){
            obj.push(scan.nextInt());
        }
        System.out.println(obj.peek());
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        obj.pop();
        System.out.println(obj.peek());
        System.out.println(obj.peek());


    }
}
