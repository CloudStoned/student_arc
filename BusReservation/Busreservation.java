package BusReservation;
import java.util.Scanner;
import java.util.HashMap;

public class Busreservation {
    public HashMap<Integer,String> list = new HashMap<>(10);
    Scanner sc = new Scanner(System.in);
    meth mth = new meth(list);
    int seatNum = 0;
    String name;

    public void mainMenu()
    {
        mth.cls();
        System.out.println("\t--- Bus Reservation System ---");
        System.out.println();
        System.out.println("\t 1. Reserve a seat ");
        System.out.println("\t 2. Cancel Reservation");
        System.out.println("\t 3. Search Seat Number");
        System.out.println("\t 4. Show All Passengers");
        System.out.println();
        System.out.println("\t---                        ---");
        System.out.print("Choose Number: ");
        int choose = sc.nextInt();
        sc.nextLine();
    
        switch (choose) {
            //Reserve Seat
            case 1:
            mth.cls();
                reserveSeat();
                break;
            
            case 2:
            mth.cls();
                cancelReservation();
            
            case 3:
            mth.cls();
                searchSit();

            case 4:
            mth.cls();
                showAll();
        
            default:
                break;
        }
        
        sc.close();
    }

    //Reserve Seat
    public void reserveSeat() {

        System.out.println("\t--- Reserve Seat ---");
        System.out.println();

        mth.displayAvailableSeats();

        System.out.println();
        System.out.print("Enter Your Name : ");
        name = sc.nextLine();

        System.out.print("Enter Your Seat Number: ");
        seatNum = sc.nextInt();

        sc.nextLine();
    
        if (list.containsKey(seatNum)) {
            mth.cls();
            System.out.println("\tSeat Number " + seatNum + " Reserved");
            System.out.print("\t    Book Another");
            System.out.println();
            mth.stopper();
            mainMenu();
        } 

        else if(seatNum > 10)
        {
            mth.cls();
            System.out.print("\tMaximum of 10 Seats");
            System.out.println();
            mth.stopper();
            mainMenu();
        }
        
        else {
            list.put(seatNum, name);
            System.out.println("\t---             ---");
            mth.cls();
            System.out.println("\t--- Successfully Reserved ---");
            System.out.println();
            mth.stopper();
            mainMenu();
        }
    }
    
    //Cancel Reservation
    public void cancelReservation()
    {
        System.out.println("\t--- Cancel Reservation ---");
        System.out.print("\tEnter Your Name: ");
        name = sc.nextLine();

        System.out.print("\tEnter Seat Number: ");
        seatNum = sc.nextInt();

        list.remove(seatNum, name);
        mth.cls();
        System.out.println("\t--- Successfuly Cancelled ---");
        mth.stopper();
        mainMenu();
    }

    //Show All Passengers
    public void showAll()
    {
        System.out.println("\t\t\t---All Passengers---");
        System.out.println();
        System.out.println("\t--- Passenger Name ---             ---   Seat Number   ---");
        System.out.println();
        for (HashMap.Entry<Integer, String> entry : list.entrySet()) {
            System.out.println("\t     Name: " + entry.getValue() + "                       \t Seat No.: " + entry.getKey());
        }
        System.out.println();
        System.out.println("\t\t---                                  ---");
        mth.stopper();
        mainMenu();
    }

    //Search Depend on the Key
    public void searchSit()
    {   
        System.out.println("\t--- Search Seat Number ---");
        System.out.println();
        System.out.print("\tEnter Your Name: ");
        String nameToSearch = sc.nextLine();
    
        boolean found = false;
        for (HashMap.Entry<Integer, String> entry : list.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(nameToSearch)) {
                System.out.println();
                System.out.println("\tYour Seat Number is: " + entry.getKey());
                found = true;
                System.out.println();
                mth.stopper();
                System.out.println();
                mainMenu();
                break;
            }
        }
    
        if (!found) {
            mth.cls();
            System.out.println("No reservation found for name: " + nameToSearch);
            mth.stopper();
            mainMenu();
        }
    }
    

    



















}
