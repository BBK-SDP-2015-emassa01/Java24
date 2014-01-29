/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Esha
 */
public class arrays {
    
    public static void main (String[] args){
        int counter = 0;
        
        ArrayList<String> names;
        names = new ArrayList<>();
        
        ArrayList<Integer> id;
        id = new ArrayList<>();

        boolean entering = false;
        while (!entering){
        System.out.println("please enter your name");
        Scanner in = new Scanner(System.in);
        String name2enter = in.nextLine();
        names.add(name2enter);

        System.out.println("please enter your Id");
        Scanner in1 = new Scanner(System.in);
        int Id2enter = in1.nextInt();
        id.add(Id2enter);
        
        counter++;
        if(name2enter == ""){
            entering= true;
        }
        else if (Id2enter == 0){
            entering = true;
        }
        }
                  
        System.out.println("Names beginning with a \'J\' and id's >=1000");
        
        for (int i = 0; i<names.size(); i++){
        if (names.get(i).charAt(0)=='J'){
            if (id.get(i)>999){
            System.out.println(names.get(i));
            System.out.println(id.get(i));
            }
        }    
        }
        
        
        
        
        
    }
    
}