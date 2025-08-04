public class Armstrongnumber {
    public static void main(String[] args) {
        int n = 153;
        int ori = n;
        String s = Integer.toString(n);
        int m = s.length();
        int sum =0;
        while(n>0){
            int dig = n%10;
            sum+=Math.pow(dig,m);
            n/=10;
        }
        if(sum==ori){
            System.out.println(ori + " is a Armstrong number");
        }else{
            System.out.println(ori+" is not a Armstrong number");
        }
    }
}
