package BusReservation;
import java.util.Scanner;
import java.util.HashMap;


public class meth  {
    private int seatNum;
    private String name;
    private HashMap<Integer,String> list = new HashMap<>(10);

    public meth(HashMap<Integer,String> list) {
        this.list = list;
    }
    
    Scanner sc = new Scanner(System.in);

    public meth(String name, int seatNum) {
        this.name = name;
        this.seatNum = seatNum;
    }

    public meth()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public  void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void stopper()
    {
        System.out.print("Press Any Key To Continue...");
        sc.nextLine();
    }

    public void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (int i = 1; i <= 10; i++) {
            if (list.containsKey(i)) {
                System.out.println("\t" + i + ": TAKEN");
            } 
            else {
                System.out.println("\t" + i + ": AVAILABLE");
            }
        }
    }
}
