package SkillDrill;

public class Drill_3 {
    /*
    3.	Write a program that prompts the user for 2 integers.
    And then prints a rectangle based on the two numbers.  For example, if the user enters 3, 4 the program would print:
    ****
    ****
    ****
    */

    public static void main(String[] args){
        recTangle(5,4);
    }

    public static void recTangle(int column, int row){
        for(int i =0; i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
