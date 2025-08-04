import java.util.ArrayList;

public class subarrprodlessk {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k=10;
        String s="";
        for (int i = 0; i <arr.length; i++) {
            s= s+arr[i];
        }
        ArrayList<String> l = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for (int j = i+1; j <=s.length() ; j++) {
                l.add(s.substring(i,j));
            }
        }
        int c=0;
        for (int i = 0; i < l.size(); i++) {
            String p = l.get(i);
            int m=1;
            for (int j = 0; j < p.length(); j++) {
                m = m*(p.charAt(j)-'0');
            }
            if(m<k) c++;
        }
        System.out.println(c);
    }
}
