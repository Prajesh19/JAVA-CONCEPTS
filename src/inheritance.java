import java.util.*;
class Human{
    String name;
    int age;
    String addr;
    long aadhar;
    Human(){}
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+addr);
        System.out.println("Aadhar : "+aadhar);
    }
}
class Employee extends Human{
    int empid;
    String des;
    Employee(){}
    void display_child(){
        System.out.println("Employee : "+ empid);
        System.out.println("Designation : "+des);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String addr = scan.nextLine();
        long aadhar = scan.nextLong();
        int empid = scan.nextInt();
        scan.nextLine();
        String des = scan.nextLine();
        Employee e = new Employee();
        e.name = name;
        e.age = age;
        e.addr = addr;
        e.aadhar = aadhar;
        e.empid = empid;
        e.des = des;
        e.display();
        e.display_child();
    }
}
