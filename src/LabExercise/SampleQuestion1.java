package LabExercise;
import java.util.Scanner;
public class SampleQuestion1 {
    /*Write a Java application that prompts the user for a number of passengers
    and then determines how many buses, and vans are required to transport the people.
    Each bus holds 64 people, each van holds 15 people.  1 bus may be partially filled with 46 or more passengers
    (it is cheaper to use 1 bus than 4 vans.)
    If there are fewer than 46 vans should be used.  1 Van may be partially filled.
     */

    public static void main(String[] args){
        int passengers;
        int numberOfBus=0;
        int numberOfVans=0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many passengers");
        passengers = input.nextInt();

        while(passengers>=46){
            numberOfBus++;
            passengers = passengers - 64;

        }

        while(passengers>0){
            numberOfVans++;
            passengers = passengers -15;
        }

        System.out.println(numberOfBus +" Bus needed");
        System.out.println(numberOfVans +" Vans needed");

    }
}
