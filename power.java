public class power{
    int a;
    int b;
    int total = 0;
    
public int powerCalc(int a, int b){
    int value = 1;
    for (int m = 1; m <= b; m++){
    value = value * 2;
    total = total + value;
    //System.out.println("power calc total = "+ total);
    }
    
return total;
}
}
