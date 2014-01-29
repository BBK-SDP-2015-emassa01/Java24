import java.util.ArrayList;
import java.util.Scanner;


public class SeqTestArrayList{

    public static void main(String[] args){
        Sequence B = new Sequence();
    Scanner in = new Scanner(System.in);
    
    ArrayList<Double> nums = new ArrayList<Double>();
    System.out.println("Enter a number to add to the array, Q to quit.");
    while (in.hasNextDouble()){
    double num2add = in.nextDouble();
    nums.add(num2add);
    
    }
    
    
    System.out.println(B.alternateSumNums(nums));
    }
}