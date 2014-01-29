import java.util.ArrayList;
import java.util.Scanner;

public class Sequence{

public static double alternateSum(double[] array){
  
double sum = 0;
    for(int j = 0; j < array.length; j++){
    if (j%2 == 0) {
         sum = sum - array[j]; }
    else {  sum = sum + array[j]; }}

    return sum;}


public static double alternateSumNums(ArrayList<Double> array){
double sum = 0;
for(int i = 0; i <array.size(); i++){
if (array.get(i)%2 ==0){
sum = sum- array.get(i);}
else {
        sum = sum+ array.get(i);}
}

    return sum;
}

}

