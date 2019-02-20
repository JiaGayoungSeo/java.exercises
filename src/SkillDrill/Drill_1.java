package SkillDrill;
import  java.util.Scanner;

public class Drill_1 {
    /*
    1.	Given a number n write a a program that will calculate the sum of all number between 1 and n inclusive.
    For example, with an n of 4 the result would be 10.  Allow the user to enter n and print the result to the screen.
     */

    public static void main(String[] args){
        int givenNumber;
        int theSum;

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number");
        givenNumber = input.nextInt();
        theSum = sum(givenNumber);

        System.out.println(theSum);
    }

    public static int sum(int limit){
        int sum =0;
        for(int i=1; i<=limit; i++){
            sum = sum+i;
        }
        return sum;
    }
}
