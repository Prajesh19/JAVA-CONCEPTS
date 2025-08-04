public class parse {
    public static void main(String[] args) {
        int n = 15;
        while(n>0) {
            if ((n & 3) == 3) {

                System.out.println("false");
            } else {
                System.out.println("true");
            }

        }
    }
}
