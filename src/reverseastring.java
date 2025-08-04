import java.util.Stack;
public class reverseastring {
    public static String reverse(String input){
      Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
       StringBuilder reversed = new StringBuilder();
      while(!stack.isEmpty()){
          reversed.append(stack.pop());
      }
        return reversed.toString();
    }
    public static void main(String[] args) {
      String input = "JavaProgramming";
      String reversed = reverse(input);
        System.out.println("Original: "+input);
        System.out.println("Original: "+reversed);
    }
}
