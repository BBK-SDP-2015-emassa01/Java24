/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author Esha
 */
public class Matrix1 {
    
    int[][] matrixValues;
    
    public Matrix1(int a, int b){
        matrixValues = new int[a][b];
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
            matrixValues[i][j]= 1;
        }
    }
    }
    
    public void setElement(int a, int b, int changeValueTo){
        if (a<matrixValues.length){
            if (b<matrixValues[0].length){
        matrixValues[a][b] = changeValueTo;
        System.out.println("Changed values in matrix: location "+a+" "+b+ " to "+ changeValueTo);
    }
        } else {
            System.out.println("Out of Size Boundary. " );
        }
    }
    
    public void setColumn(int columnNo, String newColumn){ 
        for (int i = 0; i<newColumn.length(); i++){
        if (newColumn.charAt(i) == ','){
            newColumn = newColumn.substring(0,i)+newColumn.substring(i+1);
        }
        if (newColumn.length()== matrixValues.length){
            for (int n = 0; n<matrixValues.length;n++){
                int placeholder= Integer.parseInt(newColumn.substring(n, n+1)); 
                matrixValues[n][columnNo] = placeholder;
            }
        }
    }
    }
    
    public void setRow(int RowNo, String newRow){
        for (int i = 0; i< newRow.length(); i++){
            if (newRow.charAt(i) == ','){
                newRow = newRow.substring(0,i)+ newRow.substring(i+1);
            }
            if (newRow.length() ==  matrixValues[0].length){
                for (int j = 0; j< matrixValues[0].length; j++){
                    int temp = Integer.parseInt(newRow.substring(j, j+1));
                    matrixValues[RowNo][j] = temp;
                }
            }
        }
        
    }
    public void matrixToString(){
        for (int a = 0; a<matrixValues.length;a++){
            for (int b = 0; b<matrixValues[0].length; b++){
                System.out.print(matrixValues[a][b]);
            }System.out.print(";");
            System.out.println("");
        }
    }
    
    public void prettyPrinter(){
        for (int a = 0; a<matrixValues.length;a++){
            for (int b = 0; b<matrixValues[0].length; b++){
                
                System.out.print("\t"+matrixValues[a][b]+ "\t");
                
            }System.out.println("");
        }
    }
    
    public static void main(String[] args){
        
        Matrix1 test = new Matrix1(2,6);
        test.setElement(1,4,3);
        test.setRow(1, "1,2,3,4,5,6");
        test.setColumn(4, "7,8");
        test.matrixToString();
        test.prettyPrinter();
        
        
        
    }
    
}
