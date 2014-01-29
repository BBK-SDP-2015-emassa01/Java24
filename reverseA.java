import java.util.ArrayList;

public class reverseA{

 //   int[] array = {1,2,3,4,5};

public static void reverse(double[] array){
  double[] array2 = new double[array.length];
  for (int i = 0; i<=array.length-1;i++){
  array2[i] = array[array.length-1 -i];
  
System.out.print(array2[i]+" ");
}
}

public static void revArrayList(ArrayList<Double> nums){
String revNums= "";
String finalRevNums = "";
    for (int i = nums.size()-1; i >= 0; i--){
         revNums = nums.get(i) + " ";

         finalRevNums = finalRevNums + revNums;
                 }
        System.out.print(finalRevNums);


}
}