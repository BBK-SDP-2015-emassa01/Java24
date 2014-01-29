/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class tester {
    
    public static void main (String[] args){
        Integer3 newInt = new Integer3();
        
        System.out.println("Enter a number");
        
        Scanner input = new Scanner(System.in);
        int input1 = input.nextInt();
               
        newInt.setValue(input1);
        
        System.out.println("The number you entered is");
        
        if (newInt.isEven()){
          System.out.println(" Even");  
        }
        else if (newInt.isOdd()){
            System.out.println(" Odd");
        }
        else System.out.println("undefined, your code is buggy");
        
        int parsedInt = Integer.parseInt(newInt.toString1());
        if (parsedInt == input1) {
            System.out.println(" the toString method seems to work fine");
        }
    }
    
    
}
