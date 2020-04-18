import java.util.*;
import java.util.Scanner;

class TraversingArraywithJava{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        int arrLength = arr.length;
        System.out.printf("The size of the array is %d\n\n", arrLength);
        System.out.println("The Elemmetns in the array are: \n");
        for(int i=0;i<arrLength;i++){
            System.out.println(arr[i]);
        }
    }
}
