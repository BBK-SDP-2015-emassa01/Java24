import java.util.Scanner;


public class Integer1{

public static void main(String[] args){
    
    Scanner newScanner = new Scanner(System.in);
    
    Integer2 i2 = new Integer2();
    System.out.println("Enter a number: ");
    int i = newScanner.nextInt();
    i2.setValue(i);
    
    System.out.println("The number you entered is : ");
    if(i2.isEven()){
    System.out.println("Even");
    }
    
    else if (i2.isOdd()){
    System.out.println("Odd");
    }
    
    else {
    System.out.println("This code is buggy!");
    }
    
    int parsedInt = Integer.parseInt(i2.tostring());
    if (parsedInt == i2.getValue()) {
    System.out.println("Your toString() method seems to work fine.");
    }
}
}