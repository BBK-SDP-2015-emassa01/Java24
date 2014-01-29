import java.util.Scanner;

public class Distance{

public double distanceTo(double a, double b){
    
    System.out.println("Enter an X point.");
    Scanner input = new Scanner(System.in);
    double inputX = input.nextDouble();
    
    System.out.println("Enter a Y point.");
    double inputY= input.nextDouble();
    
    double distanceX = inputX - a;
    double distanceY = inputY - b;
    
    double distanceToPoint = Math.sqrt((distanceX*distanceX)+ (distanceY*distanceY));
    System.out.println("The distance to this point is: " + distanceToPoint);
    
    return distanceToPoint;
   
}

public void distanceToOrigin(){
    
    double originX = 0;
    double originY = 0;
    
    Distance toOrigin = new Distance();
    toOrigin.distanceTo(originX, originY);
    System.out.println("This is calculating distance from your point to the origin, (0, 0)");
}

public void moveTo(double A, double B){
    double x = A;
    double y = B;
    System.out.println("Your new point is: " + x + " , " + y);
}

//public double moveTo(){
 //   point.main();
//}

}
