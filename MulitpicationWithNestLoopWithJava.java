import java.util.Scanner;

public class MulitpicationWithNestLoopWithJava{
   // public static Scanner sc;
    private static Scanner sc;
    
    public static void main(String[] args) {
        int i,j;
        System.out.println("Please enter the number: ");
        sc = new Scanner(System.in);
        //i=sc.nextInt();
        for(i=sc.nextInt();i<=10; i++){
            System.out.format("\n The Multiplication Table of %d is \n",i);
            for(j=1;j<=10;j++){
            
                System.out.format("%d * %d = %d\n",i,j,i*j);
            }
        }
        
        
        System.out.println();
        
        //for(i=sc.nextInt();i)
        
        
    }
}
