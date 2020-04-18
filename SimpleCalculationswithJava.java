import java.io.*;
import java.util.Scanner;

class SimpleCalculationswithJava{
    public static Scanner sc;
    public static void main(String[] args){
        System.out.print("Enter two values: \n");
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("The entered values are: %d , %d   \n", a,b);
        System.out.printf("The sum of the two numbers %d, %d is: %d \n", a,b,a+b);
        System.out.printf("The product of the two numbers %d, %d is : %d", a,b,a*b);
        
    }
}
