package LabMidTerm;

public class Question2_3 {
    public static void showGradeDistribution(int e, int d, int c, int b, int a){
        int[] array = {a,b,c,d,e};
        String[] labels = {"A","B","C","D","E"};

        for(int i=0;i<array.length;i++){
            System.out.print(labels[i]+": ");
            for(int j=0; j<array[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        showGradeDistribution(1,2,4,4,3);
    }
}

