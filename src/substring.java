public class substring {
    public static void main(String[] args) {
        String s = "apple";
        String s1 = "ple";
       // System.out.println(s.contains(s1));
        boolean f = false;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=i;j--){
                String sub = s.substring(i,j+1);
                if(sub.equals(s1)){
                  f = true;
                }
            }
        }
        if(f){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
