import java.io.*;

class PerfectSquareswithJava{
    static void Squares(int a, int b){
        System.out.printf("The squares from %d to %d are : \n", a,b);
        for(int i=a; i<=b; i++){
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                System.out.println(i+" ");
            }
            
        }
    }
    public static void main(String[] args){
        int x=1,y = 900;
        Squares(x,y);
    }
}
