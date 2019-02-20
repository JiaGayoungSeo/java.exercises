package SkillDrill;
import java.util.Scanner;
public class Drill_2 {
    /*
    2.	Write a new version of program 1. That only sums the even numbers.
     */
    public static void main(String[] args){
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Input your number");
        number = input.nextInt();

        System.out.println(sumOfEvenNumbers(number));
    }

    public static int sumOfEvenNumbers(int limit){
        int sumOfEven = 0;
        for(int i=1;i<=limit; i++){
            if(i%2==0){
                sumOfEven += i;
            }
        }
        return sumOfEven;
    }
}
