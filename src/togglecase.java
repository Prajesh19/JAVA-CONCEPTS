public class togglecase {
    public static void main(String[] args) {
        String s ="HeLLo";
        for(int i=0;i<s.length();i++){
            int n= s.charAt(i);
            if(n>=97 && n<=122){
                System.out.print(Character.toUpperCase((char)n));
            }else{
                System.out.print(Character.toLowerCase((char)n));
            }
        }
    }
}
