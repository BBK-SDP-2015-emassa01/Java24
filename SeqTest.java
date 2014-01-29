import java.util.Scanner;

public class SeqTest{


public static void main(String[] args){
        Sequence A = new Sequence();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for the array, and Q to Quit.");
    
        int i = 0;
        int maxSize = 5;
        double[] array = new double[maxSize];
    
        while ( i < maxSize && in.hasNextInt()){
        double number = in.nextInt();
        array[i] = number;
        i++;
    }
         System.out.println(A.alternateSum(array));
}
}