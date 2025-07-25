import java.util.*;
class student{
    private String name;
     int reg;
    student(){

    }
    void setName(String name){
        this.name =name;
    }
    void setReg(int reg){
       this.reg=reg;
    }
    String getName(){
        return name;
    }
    int getReg(){
        return reg;
    }

}
public class abstraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int reg = scan.nextInt();
        student s = new student();
        s.setName(name);
        s.setReg(reg);
        System.out.println("Name : "+ s.getName());
        System.out.println("Reg : "+ s.getReg());
    }
}
