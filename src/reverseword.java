public class reverseword {
    public static void main(String[] args) {
        String s = "Java Programming Language";
        String[] a = s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
