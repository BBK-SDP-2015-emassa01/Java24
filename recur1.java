/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esha
 */
public class recur1 {
    
    static int count = 0;
    
    public static void main(String[] args){
        
        recur1 myrecur = new recur1();
        myrecur.howBig();
    }
    
public void printNumbers(int n) {
if (n <= 0) {
return;
}
System.out.println(n);
printNumbers(n-2);
printNumbers(n-3);
System.out.println(n);
}
    
int mcCarthy91(int n) {
if (n >=100) {
return n - 10;
} else {
    System.out.println(n + "adding 11 now");
return mcCarthy91(mcCarthy91(n+11));
}
}

public int howBig() throws StackOverflowError{
    recur1 howBig = new recur1();
    howBig.count++;
    howBig.howBig();
    return count;
}
}
