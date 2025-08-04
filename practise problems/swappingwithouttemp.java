import java.sql.SQLOutput;

public class swappingwithouttemp
{
    public static void main(String[] args)
    {
        int n =5;
        int m =10;
        n = n^m;
        m = n^m;
        n = n^m;
        System.out.println(" a = "+ n);
        System.out.println("b = " + m);
    }
}
