import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class loginpage {
    public static void main(String[] args) {
        boolean validuname = false;
        boolean validpass = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("username : ");
        String user = scan.next();
        System.out.println("Phone number: ");
        Long ph = scan.nextLong();
        System.out.println("Password : ");
        String pass = scan.next();
        scan.nextLine();
        String correctpass = user.substring(0,4) + String.valueOf(ph).substring(6,10);
           if(user.endsWith("@gmail.com"));
            validuname = true;
        if(pass.equals(correctpass)){
            validpass = true;
        }
        if(validuname == true && validpass ==true){
            System.out.println("Login Successfull");
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> userotp = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            userotp.add(sc.nextInt());
        }
        ArrayList<Integer> otp = new ArrayList<Integer>();
        otp.add(1);
        otp.add(2);
        otp.add(3);
        otp.add(4);
        for(int i=1;i<=24;i++){
            Collections.shuffle(otp);
            if(userotp.equals(otp)){
                System.out.println("Matched");
            }
            else{
                System.out.println("Not Matched");
            }
        }
    }

}
