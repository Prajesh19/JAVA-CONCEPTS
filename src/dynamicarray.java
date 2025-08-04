import java.util.*;
public class dynamicarray {
    final int initialcapacity =16;
   private int[] arr;
    private int size;
    private int cap;
    dynamicarray(){
        size=0;
        arr= new int[initialcapacity];
        int cap = initialcapacity;
    }
    public void add(int val){
        if(size==cap) expandArray();
        arr[size++] = val;
    }
    public void expandArray(){
        cap*=2;
        java.util.Arrays.copyOf(arr,cap);
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int val,pos;
        dynamicarray list = new dynamicarray();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\n--------List menu--------");
            System.out.println("1.Insert at end\n");
            System.out.println("2.Display the list\n");
            System.out.println("3.Insert at specified position\n");
            System.out.println("4.Delete from specified position\n");
            System.out.println("5.Exit\n");
            System.out.println("\n-------------------------------");
            System.out.println("Enter your choice:\t");
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter data: ");
                    val = scan.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the position (from 0): ");
                    pos = scan.nextInt();
                    System.out.println("Enter data: ");
                    val = scan.nextInt();
                    //list.insertPos(pos,val);
                    break;
                case 4:
                    System.out.println("Enter the position (from 0): ");
                    pos = scan.nextInt();
                    if(pos<0){
                        System.out.println("Invalid Position");
                        break;
                    }
                    System.out.println("Enter data: ");
                   // list.deletePos(pos,val);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ");
            }
        }

    }
}
