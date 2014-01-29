
import java.util.Scanner;

public class point{
 double x;
 double y;
 
 public void Clone(){
    point newPoint1 = new point();
    newPoint1.x = this.x;
    newPoint1.y = this.y;
    System.out.println("Your cloned point is: " +newPoint1.x + " , " + newPoint1.y);

}
  public void opposite(double a, double b){
     
      double oppX = -1*a;
      double oppY = -1*b;
    //point newPoint2 = new point();
    //newPoint2.x = -1*(this.x);
    //newPoint2.y = -1*(this.y);  
    System.out.println("Your new point is: " +oppX + " , " + oppY); 

 
 }


public static void main(String[] args){
 point newPoint = new point();

    System.out.println("Please enter your starting X point.");
    Scanner input = new Scanner(System.in);
    double startInputX = input.nextDouble();
    
    System.out.println("Please enter your starting Y point.");
    double startInputY= input.nextDouble();
 
 newPoint.x = startInputX;
 newPoint.y = startInputY;
 
 System.out.println("What would you like to do? \n"
         + "Calculate your distance to another point? \t\t\t\t\t\t\t Please Press 1 \n"
         + "Calculate your distance to the origin? \t\t\t\t\t\t\t\t Please Press 2 \n"
         + "Change the co-ordinates of your current point? \t\t\t\t\t\t\t Please Press 3 \n"
         + "Find out the co-ordinates of your current point? \t\t\t\t\t\t Please Press 4 \n"
         + "Reverse the cartesian plane of your point (negative to positive co-ordinates or vice versa)? \t Please Press 5 \n");
 
 Distance A = new Distance();
 
 int Choice = input.nextInt();
 if (Choice ==1){
 A.distanceTo(newPoint.x, newPoint.y);
 }
 if (Choice ==2){
 A.distanceToOrigin();
 }
 if (Choice ==3){
    System.out.println("Please enter your move-to-X point.");
    double startInput2X = input.nextDouble();
    
    System.out.println("Please enter your move-to-Y point.");
    double startInput2Y= input.nextDouble();
    
    A.moveTo(startInput2X,startInput2Y);
 }
 if (Choice ==4){
     point newPoint1 = new point();
     newPoint1.Clone();
 }
 if (Choice ==5){
    point newPoint2 = new point();
    newPoint2.opposite(newPoint.x, newPoint.y);
 }
     
 }

}