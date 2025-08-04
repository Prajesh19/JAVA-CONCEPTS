public class powof {
    public static void main(String[] args) {
       int n =32;
       if((n & n-1)==0){ // ((0 1 0 1 *
                           // 0 1 0 0 )==0)
           System.out.println("True");
       }else{
           System.out.println("False");
       }
    }
}
