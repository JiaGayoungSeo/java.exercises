package SkillDrill;

import java.util.Scanner;
public class Drill_4 {
    /*
    4.	Write a parameterless method that prompts the user for non-negative input.
    If the user enters a negative number, notify them of their error and prompt again.
    Return the first non-negative number entered by the user.
     */
    public static void main(String[] args){
        System.out.print(parameterless());
    }

    public static int parameterless(){
        int inputNumber;

        Scanner input = new Scanner(System.in);
        System.out.println("Input non-negative number");

        while(true){
            inputNumber = input.nextInt();
            if(inputNumber<0){
                System.out.println("Error! Input non-negative number");
                continue;
            }
            if(inputNumber>0){
               return inputNumber;
            }
        }
    }
}
