
import java.util.Scanner;

public class CollectMarks{

    public void launch(){
    
        
        int mark;
        CheckMark list1 = new CheckMark();
        
    do {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your mark. Type \'-1\' to finish.");
    mark = in.nextInt(); 
    System.out.println("You entered: " + mark);
    list1.CheckMarks(mark);
   }
    while (mark !=-1);
    
    list1.DisplayMarks();
    
    

    
    

}
    }

