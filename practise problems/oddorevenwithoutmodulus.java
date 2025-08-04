import java.sql.SQLOutput;
import java.util.*;
public class oddorevenwithoutmodulus {
    public static void main(String[] args) {
        int n = 2;
        if((n|1)>n){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
