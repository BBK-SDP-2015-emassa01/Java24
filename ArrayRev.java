import java.util.Scanner;
public class ArrayRev{

/*public static void reverse(double[] array){
  double[] array2 = new double[array.length];
  for (int i = 0; i<=array.length-1;i++){
  array2[i] = array[array.length-1 -i];
  
System.out.print(array2[i]+" ");
}}*/

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double[] array = new double[3];
    double[] reverseArray = new double[array.length];
    
    for (int i = 0; i <array.length; i++){
        System.out.println("Enter a number for the " + i + " element of the array. " );
        if (in.hasNextDouble()&& i< array.length){
        array[i] = in.nextDouble();
        }
    }
    
    //need to call a reverse array method
        
    reverseA.reverse(array);
    
    }
}    




