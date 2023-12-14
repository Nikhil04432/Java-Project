/*
                Grade A is assigned to student who as marks more than 85
                Grade B is assigned to student who as marks in between 75  to 84
                Grade C is assigned to student who as marks in between 60  to 74
                Grade D is assigned to student who as marks less than 60
 */
import java.lang.*;
import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Subject : ");
        int no_sub = sc.nextInt();

        System.out.println("Accepting Marks of " + no_sub + " Subjects Out of 100 ");
        float[] arr = new float[no_sub];
        for (int i = 0; i < no_sub; i++) {
            System.out.println("Enter marks of " + (i+1) + " th Subject ");
            arr[i] = sc.nextFloat();
        }

        System.out.println(" Displaying  marks ");

        for(float i : arr )
        {
            System.out.println(i +" ");
        }

        float ret = calculate(arr , no_sub);
        System.out.println("Average marks is "+ret);

        char ab = grade_Cal(ret);
        System.out.println("Grade of a Student "+ ab );
    }

    static char grade_Cal(float ret)
    {
        char ch ;
        if(ret>=85)
        {
            ch = 'A';
        } else if (ret >= 75 && ret <= 84) {
            ch = 'B';
        } else if (ret >= 60 && ret <= 74) {
            ch = 'C';
        }
        else{
            ch = 'D';
        }

        return ch ;
    }

    static float calculate(float arr[] , int no)
    {
        float avg ;
        float total =0;

        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];

        }
        System.out.println("Total Marks is : "+ total + " out of " + (no*100));

        avg = total / no ;

        return avg ;
    }


}