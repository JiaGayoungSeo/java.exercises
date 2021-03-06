package MidPractice;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;
import java.util.Scanner;

public class TicketManager {
    static Scanner input;
    static Ticket[] tickets;

    public static void main(String[] args){
        getData ();
        int choice =0;
        while(choice!=7){
            execute ( showMenu () );
        }
    }

    static void getData(){
        tickets=new Ticket[8];
        tickets[0] = new InternalTicket("Clean floors in 4.203.01", new Date(2,22,2016), "Jenny Smith");
        tickets[1] = new ExternalTicket("Adjust security camera in 4.240 to look directly at floor", new Date(11,13,2014), "Hip Hop Floors", "306.691.5544");
        tickets[2] = new InternalTicket("Replace lock on east entrance", new Date(2,22,2016), "Sam Jenkins");
        tickets[3] = new InternalTicket("Fix broken chairs in 3.308",new Date(1,12,2016), "Scott Milch");
        tickets[4] = new ExternalTicket("Mount power bars in 4.240 on ceiling", new Date(11,13,2014), "Walls R Us", "306.691.5555");
        tickets[5] = new InternalTicket("Fix celing tiles in 4.240", new Date(10,11,2016), "Jeremy Jones");
        tickets[6] = new ExternalTicket("Clean lockers 71-109", new Date (11,12,2014), "Clean it Good", "306.691.5566");
        tickets[7] = new ExternalTicket("Fix speling mistax in thiz tiket", new Date(11,18,2014), "Walls R Us", "306.692.2211");
    }

    static int getValidChoice(int min, int max){
        input = new Scanner ( System.in);
        int choice = input.nextInt ();
        while(choice<min || choice>max){
            System.out.println ( "Please enter a valid number" );
            System.out.print(">>");
            choice = input.nextInt ();
        }
        return choice;
    }

    static int showMenu(){
        System.out.println ( "------------------------------------------------------------------" );
        System.out.println ( "1.\tDisplay all tickets in sorted order using short display" );
        System.out.println ( "2.\tDisplay a ticket by ticket ID using long display" );
        System.out.println ( "3.\tDisplay all company names with open tickets(External tickets only)" );
        System.out.println ( "4.\tShow all tickets submitted today" );
        System.out.println ( "5.\tClose a ticket by ticket ID" );
        System.out.println ( "6.\tConvert an external ticket to an internal ticket " );
        System.out.println ( "7.\tExit the program" );
        System.out.println ( "------------------------------------------------------------------" );
        System.out.print(">>");
        return  getValidChoice ( 1,7 );
    }

    static void execute(int choice){
        switch (choice){
            case 1: menu1 (); break;
            case 2: menu2 (); break;
            case 3: menu3 (); break;
            case 4 : menu4 (); break;
            case 5 : menu5 (); break;
            case 6: menu6 (); break;
            case 7: System.exit ( 0 );
        }
    }

    static void menu1(){
        Arrays.sort ( tickets );
        for(int i=0;i<tickets.length;i++){
            tickets[i].shortDisplay ();
        }
    }

    static int inputNumber(){
        input = new Scanner ( System.in );
        return  input.nextInt ();
    }

    static void menu2(){
        System.out.println ( "Enter a ticket ID" );
        int ticketId = inputNumber ();
        for(int i=0;i<tickets.length;i++){
            if(ticketId == tickets[i].getTicketId ()){
                tickets[i].longDisplay ();
            }
        }
    }

    static void menu3(){
        for(int i=0;i<tickets.length;i++){
            if(tickets[i] instanceof  ExternalTicket){
                if(tickets[i].isCompleted ()==false){
                    System.out.println ( ((ExternalTicket)tickets[i]).getCompanyName () );
                }
            }
        }
    }

    static void menu4(){
        for(int i=0;i<tickets.length;i++){
            if(tickets[i].getDateSubmitted ().getDay ()==22 && tickets[i].getDateSubmitted ().getMonth ()==2 && tickets[i].getDateSubmitted ().getYear ()==2016){
                 tickets[i].longDisplay ();
                 System.out.println ( "------------------------------------------" );
            }
        }
    }
    static void menu5(){
        System.out.println ( "Enter a ticket ID" );
        int ticketId = inputNumber ();
        for(int i=0;i<tickets.length;i++ ){
            if(ticketId==tickets[i].getTicketId ()) {
                tickets[i].setCompleted ();
                System.out.println ( "Closed!" );
            }
        }
    }

    static void menu6(){
        System.out.println ( "Enter the ticket ID" );
        int ticketID = inputNumber ();
        for(int i= 0;i<tickets.length;i++){
            if(tickets[i].getTicketId ()==ticketID){
               if(tickets[i] instanceof ExternalTicket){
                   tickets[i] = newInternalTicket ( (ExternalTicket)tickets[i] );
               }
            }
        }
    }

    static InternalTicket newInternalTicket(ExternalTicket externalTicket){
        input = new Scanner ( System.in );
        System.out.println ( "Enter a name to assign the ticket to" );
        System.out.print (">>");
        String name = input.next (  );
        InternalTicket newTicket = new InternalTicket ( externalTicket.getTicketDescription (),externalTicket.getDateSubmitted (),name );
        System.out.println ( "Transferred to Internal ticket! " );
        return  newTicket;
    }
}
