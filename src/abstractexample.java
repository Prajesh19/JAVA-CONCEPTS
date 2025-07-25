import java.util.*;
class Hotel{
    private String room;
    private double cost;
    private int days;
    Hotel(){}
    void setRoom(String room){
        this.room = room;
    }
    void setCost(double cost){
        this.cost=cost;
    }
    void setDays(int days){
        this.days=days;
    }
    String getRoom(){
        return room;
    }
    double getCost(){
        return cost;
    }
    int getDays(){
        return days;
    }
}
public class abstractexample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Room type");
        String room = scan.nextLine();
        System.out.println("Enter the Cost per Night");
        double cost = scan.nextDouble();
        System.out.println("Enter the Number of Nights");
        int days = scan.nextInt();
        Hotel h = new Hotel();
        h.setRoom(room);
        h.setCost(cost);
        h.setDays(days);
        System.out.println("Room Type : " + h.getRoom());
        System.out.println("Cost per Night : " + h.getCost());
        System.out.println("Number of Nights : " + h.getDays());
        System.out.println("Total Booking Cost : " + (h.getCost()*h.getDays()));
    }
}
