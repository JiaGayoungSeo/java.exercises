package LabExercise;

public class SampleQuestion2_1 {

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

        for(int i = 0; i< distance ; i++){
            if(500<i && i<1500){
                ShippingCost3 += 0.03;
            }
            if(i>1500){
                ShippingCost3 += 0.05;
            }
        }

        TotalShippingCost = ShippingCost1 + ShippingCost2 + ShippingCost3;

        return  TotalShippingCost;
    }
}
