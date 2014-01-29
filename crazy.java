public class crazy{
String inputs;
float floatNum;

    
public static void main(String[] args){
    System.out.println("taking in an argument...." + "\n"+ args[0]);
    String inputs = args[0];
    System.out.println("converting to float...."+ "\n"+ inputs);
    float floatNum = Float.parseFloat(inputs);
    System.out.println("creating a Float object....");
    Floats q = new Floats();
    q.convertToInt(floatNum);
}


}