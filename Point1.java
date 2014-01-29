public class Point1 {
private double x=10;
private double y=10;
public Point1(double x, double y) {
this.x = x;
this.y = y;
}
public double getX() {
return x;
}
public double getY() {
return y;
}
public void moveTo(Point1 remote) {
this.x = remote.x;
this.y = remote.y;
}
}