public class vowelsconsonant {
    public static void main(String[] args) {
        String s = "yoghurt";//
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' || s.charAt(i) != 'e' || s.charAt(i) != 'i' || s.charAt(i) != 'o' || s.charAt(i) != 'u') {
                System.out.print("C");
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    System.out.print("V");
                }
//            else{
//                System.out.print("V");
//            }
            }
        }
    }
}
