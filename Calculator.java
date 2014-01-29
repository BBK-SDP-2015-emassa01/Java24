public class Calculator{
    
    int a = 1;
    int b = 2;
            

public static int add(){
    Calculator a = new Calculator();
int value = a.a + a.b;
System.out.println(value);
    return value;
            }

private static int subtract(int a, int b){
int value = a - b;
System.out.println(value);
    return value;
}
private static int multiply(int a, int b){
    int value = a * b;
    System.out.println(value);
    return value;
}

private static double divide(int a, int b){
    int intA = a;
 double doubleA = (double) intA;
     int intB = b;
 double doubleB = (double) intB;

 double value = doubleA/doubleB;
 System.out.println(value);
 return value;

}
private static double modulus(int a, int b){
    int intA = a;
 double doubleA = (double) intA;
     int intB = b;
 double doubleB = (double) intB;

 double value = doubleA%doubleB;
 System.out.println(value);
 return value;
}

public static void main(String[] args){
add();
subtract(3, 4);
multiply(5, 6);
divide(7, 8);
modulus(9, 10);


}

}

