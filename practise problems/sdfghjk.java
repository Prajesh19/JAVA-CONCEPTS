import java.util.Scanner;

public class sdfghjk {
    public static void main(String[] args) {
//        String str = "madam";
//        StringBuilder sb = new StringBuilder(str);
//       String rev = sb.reverse().toString();
//       if(rev.equals(str)){
//           System.out.println("true");
//       }else{
//           System.out.println("false");
//       }
//        String str = "abcd";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int count=0;
//            for(int j=0;j<str.length();j++){
//                if(str.charAt(j) == ch){
//                    count++;
//                }
//            }
//            if(count > 1){
//                System.out.println(ch);
//                return;
//            }
//        }
//        System.out.println("-1");


        // length 1 = 2
        //length 2
        Scanner scan = new Scanner(System.in);
        int len1 = scan.nextInt();
        int[] arr1 = new int[len1];
        for (int i = 0; i < len1; i++) {
            arr1[i] = scan.nextInt();
        }
        int len2 = scan.nextInt();
        int[] arr2 = new int[len1];
        for (int i = 0; i < len2; i++) {
            arr2[i] = scan.nextInt();
        }
        int size =( len1 + len2);
        int[] final1 = new int[size];
        int index=0;
        for (int i = 0; i <len1 ; i++) {
            final1[index++] = arr1[i];
        }
        for (int i = 0; i <len2 ; i++) {
            final1[index++] = arr2[i];
        }


    }
}
