package LabExercise;
import java.util.Scanner;
public class SampleQuestion_OvertimeCalculator {
    public static void main(String[] args){
        int hours = 0;
        double salary=0;
        Scanner input = new Scanner(System.in);

        while(hours>=0){
            System.out.println("Input your working hours");
            hours = input.nextInt();
            if (hours <0 ) break;
            System.out.println("Input your wages per hour");
            double payRate = input.nextDouble();
            salary = calculatePay(hours,payRate);
            System.out.println(salary + " is the payment");
        }

    }

    public static double calculatePay(int hours, double payRate){
        int overtime =0;
        double payment=0;

        for(int i =0; i<hours; i++){
            if(i<40){
                overtime =0;
            }
            if(i>=40){
                overtime ++;
            }
        }
        payment = (hours-overtime)*payRate + (overtime*payRate*1.5);

        return payment;
    }
}
