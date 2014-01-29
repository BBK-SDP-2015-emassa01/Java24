import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates{

    public static ArrayList<Double> RemoveDuplicates(ArrayList<Double> list){
    int compareStart = 0;
    int compareEnd = list.size();
    
    ArrayList<Double> workingList = new ArrayList<Double>(list);
    
    while (compareStart<compareEnd-1){
        int currentPlace = compareStart+1;
        while(currentPlace<compareEnd-1){
    if(workingList.get(compareStart).equals(workingList.get(currentPlace))){
    workingList.remove(currentPlace);
    compareEnd--;
    } else {
        currentPlace++;
    }}
            compareStart++;
    }
         
       return workingList; 
    }
        
 
    
}