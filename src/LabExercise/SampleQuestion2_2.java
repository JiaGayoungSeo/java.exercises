package LabExercise;

public class SampleQuestion2_2 {

    public static void main(String[] args){
        System.out.println(cost(0.6,15.3,2050));

    }

    public static double volume (double weight, double height, double depth){
        return weight*height*depth/100000;
    }

    public static double cost(double cubicMeters,double weight, double distance){
        double ShippingCost1, ShippingCost2;
        double ShippingCost3 =0;
        double TotalShippingCost;

        ShippingCost1 = 2.5*weight;
        ShippingCost2 = 25.50*cubicMeters;

        while(distance>500 && distance<1500){
            distance --;
            ShippingCost3 += 0.05;
        }
        while(distance>1500){
            distance --;
            ShippingCost3 += 0.03;
        }

        TotalShippingCost = ShippingCost1 + ShippingCost2 + ShippingCost3;
        return  TotalShippingCost;
    }
}
