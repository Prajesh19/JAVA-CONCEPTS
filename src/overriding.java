import java.util.*;
class human {
    String name;
    int age;
    human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
    class Student extends human {
        int reg;
        float mark;
        Student(String name, int age, int reg, float mark) {
            super(name, age);
            this.reg = reg;
            this.mark = mark;
        }

        protected void display() {
            super.display();
            System.out.println("Reg Num : " + reg);
            System.out.println("Mark : " + mark);
        }
    }
    public class overriding {
        public static void main(String args[]) {
            Student s = new Student("Arun",22, 500501, 87.6f);
            s.display();
    }
}
