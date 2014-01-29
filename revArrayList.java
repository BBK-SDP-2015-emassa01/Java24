import java.util.ArrayList;
import java.util.Scanner;

public class revArrayList { 
    
    
    public  static void main(String[] args){
    reverseA C = new reverseA();
    RemoveDuplicates D = new RemoveDuplicates();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to add to the array. Q to quit");
    
    ArrayList<Double> nums = new ArrayList<Double>();
    while (in.hasNextDouble()){
    double number = in.nextDouble();
    nums.add(number); }
    
    C.revArrayList(nums);
    System.out.println("\n");
    System.out.println(D.RemoveDuplicates(nums));
    
    }
    

    

    }
    
