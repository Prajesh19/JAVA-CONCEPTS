import java.util.*;
public class browsinghistory {
    int top;
    String[] arr;
    int size;
    browsinghistory(int n){
        size = n;
        arr = new String[size];
        top =-1;
    }
    public void push(String val){
        if(top==size-1){
            System.out.println("Stack overflow");
        }
        arr[++top] = val;
    }
    public String pop(){
        if(top==-1){
            System.out.println("Stack underflow");
        } return arr[top--];
    }
    public String peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public void display(){
        System.out.println("\n===Browsing History===");
        for (int i=top;i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your size : ");
        int size = scan.nextInt();
        browsinghistory brw = new browsinghistory(size);
        for(int i=1;i<=size;i++){
            System.out.println("Enter url "+i +": ");
            brw.push(scan.next());
        }
//        System.out.println(brw.pop());
//        System.out.println(brw.peek());
//        brw.pop();
//        System.out.println(brw.peek());
          brw.display();
    }
}
