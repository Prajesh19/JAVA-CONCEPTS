import java.util.*;
class demo
{
    int adder(int a , int b)
    {
        return a+b;
    }
    double adder(double a , double b)
    {
        return a+b;
    }
    int adder(int a , int b, int c)
    {
        return a+b+c;
    }
    int adder(int...values)
    {
        int sum =0;
        for(int data: values)
            sum = sum +data;
        return sum;
    }
}
public class polymorpishm {
    public static void main(String[] args) {
        demo d = new demo();
        System.out.println(d.adder(5 ,10));
        System.out.println(d.adder(5.5 , 10.0));
        System.out.println(d.adder(5,10,15));
        System.out.println(d.adder( 1,2,3,4,5,6,7,8,9,10));
    }
}
