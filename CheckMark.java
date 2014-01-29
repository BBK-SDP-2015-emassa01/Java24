public class CheckMark{

     private static int numberOfMarks = 0;
     int numberOfDistinctions = 0;
     int numberOfPasses = 0;
     int numberOfFails = 0;
     int numberOfInvalid = 0;
     
     public void CheckMarks(int mark){


if((mark>70)&& (mark<=100)){
    numberOfDistinctions++;
    numberOfMarks++;

}
else if((mark>=50)&& (mark<=69)){
    numberOfPasses++;
    numberOfMarks++;

}
else if((mark>=0)&& (mark<=49)){
    numberOfFails++;
    numberOfMarks++;

}
    
else {numberOfInvalid++;}
     }
    
     public void DisplayMarks(){
        System.out.println("The number of distinctions is: " + numberOfDistinctions + 
            "\n The number of passes is:  " + numberOfPasses + "\n The number of fails is: "
            + numberOfFails + "\n The total number of marks is: " + numberOfMarks);
}
}



