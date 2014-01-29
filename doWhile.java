/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.Integer;
import java.util.Scanner;
/**
 *
 * @author Esha
 */
public class doWhile {
    String mark;
    int score;
    int totalScore = 0;
    int numberStudents= -1;
    int distinctions = 0;
    int pass = 0;
    int fail = 0;
    int invalid = -1;
    int average = 0;
    
    public void launch(){
        
        
        do{
            System.out.println("Please enter your mark");
            Scanner in = new Scanner(System.in);
          try{  
        mark = in.nextLine();
        
        
        score = Integer.parseInt(mark);
       
        totalScore = totalScore + score;
        if (score>69 && score <=100){
            distinctions++;
        } else if (score > 49 && score <=69){
            pass++;
        } else if (score >=0 && score<=49){
            fail++;
        } else {
            invalid++;
        } numberStudents++;
          }catch (NumberFormatException ex){
            //ex.printStackTrace();
            System.out.println("That's not an integer!");
        }
    } while (!mark.equals("-1"));
        average = totalScore /numberStudents;
    
    System.out.println("Number of Students: "+numberStudents+"\nDistinctions: "+distinctions+" \nPasses:"+pass+"\nFails: "+fail +
            "\nInvalid: "+ invalid+"\nAverage"+average);
    
    }
        public static void main(String[] args){
            doWhile classPiJ = new doWhile();
            classPiJ.launch();
    }

}

