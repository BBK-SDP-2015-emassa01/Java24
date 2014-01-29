/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
import java.util.Scanner;

public class simpleBoolean {
    
  
    public static void main (String[] args){
        
        System.out.println("What option do you want today?"
                + "\n > Press 1 for calulator? \n > Press 2 for Bank.");
        Scanner inputFirst = new Scanner(System.in);
        int input1 = inputFirst.nextInt();
        
        if (input1 ==1){
                
        int totalNumbers = 0;
        int totalOfNumbers = 0;
        
        boolean list = false;
        
        while (!list){
            System.out.println("Please enter a number");
            Scanner input = new Scanner(System.in);
            int inputNum = input.nextInt();
            
            if (inputNum!= 0){
                totalNumbers++;
                totalOfNumbers=totalOfNumbers+inputNum;
            } else {
                list = true;
            }   
        }
        System.out.println("Total numbers entered > " + totalNumbers);
        System.out.println("Total Of numbers entered > " + totalOfNumbers);
    }
        if (input1 ==2){
        System.out.println("Please enter a number for your choice. \n "
                + "For  Friendly Bank press 1 \n For Retail Bank press 2 \n For Commercial Bank press 3 "
                + "\n For automated service press 4 \n For Santander press 5");
        Scanner choice = new Scanner(System.in);
        int selectedChoice = choice.nextInt();
        
        boolean choiceFromList = false;
        
        while (selectedChoice <0 || selectedChoice >5){
            choiceFromList = false;
            System.out.println("That is not a valid option \n Please enter another choice.");
            Scanner input2 = new Scanner(System.in);
            int inputNum2 = input2.nextInt();
        
        
        if (inputNum2 >0 && inputNum2 <=5){
        selectedChoice =0;
        choiceFromList = true;
        switch (inputNum2){
            case 1:
                System.out.println("No one is friendly now a days");
                break;
            case 2:
                System.out.println("Retail Speeshtail");
                break;
            case 3:
                System.out.println("Nerd");
                break;
            case 4:
                System.out.println("You recluse");
                break;
            case 5:
                System.out.println("Santander are cool");
                break;
            //default: 
                
        } 
        }
        }
    }
    }
}

        

    


        
    

