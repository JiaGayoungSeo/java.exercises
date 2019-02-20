package com.company;

public class multiplesOf3and5 {
    /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.*/
    public static int sum (int a, int b, int limit ){
        int sum=0;
        for(int i=0;i<limit;i++){
            if(i%a==0 || i%b==0){
                sum += i;
            }
        }
        for(int j=0;j<limit;j++){
            if(j%a==0 && j%b==0){
                sum = sum -j;
            }
        }
        return sum;
    }

    public  static void main (String[] args){
        System.out.println(sum(3,5,10));
    }
}
