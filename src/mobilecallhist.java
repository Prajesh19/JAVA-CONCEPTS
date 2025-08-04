import java.util.Scanner;
import java.util.*;
public class mobilecallhist {
//    int top;
//    String[] arr;
//    int size;
//    mobilecallhist(int n) {
//        size = n;
//        arr = new String[n];
//        top = -1;
//    }
//    public void push(String val){
//        if(top ==arr.length-1){
//            System.out.println("Stack overflow");
//        }
//        arr[++top] = val;
//    }
//    public String pop(){
//        if(top==-1){
//            System.out.println("Stack underflow");
//        }
//        return arr[top--];
//    }
//    public String peek(){
//        return arr[top];
//    }
//    public boolean isEmpty(){
//        if (top==-1){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        mobilecallhist obj = new mobilecallhist();
//        System.out.println(obj.peek());
//        obj.pop();
//        System.out.println(obj.peek());
//        obj.pop();
//        System.out.println(obj.peek());
//    }
public static void main(String[] args) {
 Stack<String> str = new Stack<>();
 String s = "hello";
 String s1 ="";
 for (int i=s.length()-1; i>=0 ; i--) {
  s1 = s1+s.charAt(i);
 }
 str.push(s1);
 System.out.println(str.peek());
}


}

