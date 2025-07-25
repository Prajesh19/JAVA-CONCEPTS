public class Countvowcon {
    public static void main(String[] args) {
        String s ="hello world";
        int count=0;
        int count1=0;
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
                count++;
            }
            else if(c==' '){
                continue;
            }else{
                count1++;
            }
        }
        System.out.println("Vowels: "+count + " Consonants: "+count1);
    }
}
