package LabExercise;
import java.util.Scanner;
public class SampleQuestion_ShippingCalculator {

    public static void main(String[] args){
        int numberOfWidgets;
        //int numberOfCrates;
        //double costOfShipping;

        Scanner input = new Scanner(System.in);
        System.out.println("Put the number of widgets");
        numberOfWidgets = input.nextInt();
        //numberOfCrates = calculateCrates(numberOfWidgets);
        // costOfShipping = calculateShipping(numberOfCrates);

        System.out.println(calculateCrates(numberOfWidgets)+" crates are being shipped");
        System.out.println(calculateShipping(calculateCrates(numberOfWidgets))+" charged for shipping");

    }

    public  static  int calculateCrates(int widgets){
        int numberOfCrates = 0;

        while(widgets>18){
            numberOfCrates ++;
            widgets -= 18;
        }
        return  numberOfCrates;
    }


    public static double calculateShipping(int crates){
        double costOfShipping = 0;

        if(crates<=10) costOfShipping = crates*7.5;

        else  {
            for (int i = 0; i < 10; i++) {
                costOfShipping += 7.5;
                crates--;
            }
            costOfShipping = costOfShipping + crates*5.50;
        }
        return  costOfShipping;
    }


}
