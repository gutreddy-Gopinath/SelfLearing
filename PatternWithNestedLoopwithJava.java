import java.util.Scanner;

public class PatternWithNestedLoopwithJava{
   // public static Scanner sc;
    private static Scanner sc;
    
    public static void main(String[] args) {
        int i,j,k;
        System.out.println("Please enter the number: ");
        sc = new Scanner(System.in);
        i=sc.nextInt();
        System.out.println("\n The required pattern is below: ");
        for(k=1;k<=i; k++){
            //System.out.format("\n The Multiplication Table of %d is \n",i);
            for(j=1;j<=k;j++){
            
                System.out.print(j+" ");
                
            }
            System.out.print("\n");
        }
        
        
        System.out.println();
        
        //for(i=sc.nextInt();i)
        
        
    }
}
