package LabMidTerm;
import java.util.Scanner;

public class Question2 {
    //2.1
    public static int getValidInput(int low, int high, String message) {
        int inputNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number between " + low + " and" + high);

        inputNumber = sc.nextInt();

        if (low > high) return -1;

        while (true) {
            if (inputNumber > low && inputNumber < high) {
                return  inputNumber;
            }
            else {
                System.out.println(message);
                continue;
            }
        }
    }

    public static char calculateLetterGrade( int grade, int totalMarks){
        char f = 'F';
        char d = 'D';
        char c = 'C';
        char b = 'B';
        char a = 'A';
        char non = 'N';
        if(grade/totalMarks>0 && grade/totalMarks<=50) return f;
        else if(grade/totalMarks>50 && grade/totalMarks<60) return d;
        else  if(grade/totalMarks>60 && grade/totalMarks<70) return c;
        else  if(grade/totalMarks>70 && grade/totalMarks<80) return b;
        else  if (grade/totalMarks>80 && grade/totalMarks<100) return a;
        else return non;
    }

}

