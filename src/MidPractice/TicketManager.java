package MidPractice;

import java.util.Scanner;

public class TicketManager {
    static Scanner input;
    public static void main(String[] args){

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
}
