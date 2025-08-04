public class longestowrd {
    public static void main(String[] args) {
        String s = "java programming language";
        String[] str = s.split(" ");
        int max =0;
        String st="";
        for (int i = 0; i < str.length; i++) {
            int l = str[i].length();
           if(l>max){
               max = l;
                st = str[i];
           }
        }
        System.out.println(st + ": "+max);
    }
}
