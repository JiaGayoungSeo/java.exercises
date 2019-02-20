package LabExercise;

public class Test {
    public static void main(String[] args){
        double distance = 600;
        double shippingCost=0;

        for(int i = 0; i<distance; i++){
            if(500<=i && i<1500){
                shippingCost += 0.03;
            }
            if (i>=1500){
                shippingCost += 0.05;
            }
        }
/*
        while(distance>1500){
            distance --;
            shippingCost += 0.03;
        }

        while(distance>500){
            distance --;
            shippingCost += 0.05;
        }


*/
        System.out.println(shippingCost+" Shipping cost");
    }
}
