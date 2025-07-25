public class firstnonrepstr {
    public static void main(String[] args) {
        String s ="aabbcde";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){

                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s.charAt(i));
                break;
            }
            count=0;
        }
    }
}
