/*
 * getValue(): returns the value of this number as an int, a getter. 
        
    setValue(int): a setter.

    isEven(): returns true if the number is even, false otherwise. 
    
    isOdd(): the opposite.

    prettyPrint(): prints the value of the integer on the screen. 

    toString(): returns a String equivalent to the number.
 */

/**
 *
 * @author Esha
 */
public class Integer3 {
    
    private int ValueOfInt;
    
    public void setValue(int x){
        ValueOfInt = x;
    }
    
    public int getValue(){
        return ValueOfInt;
    }
    
    public boolean isEven(){
        boolean isEven = false;
        if (this.ValueOfInt%2==0){
            isEven = true;
        } return isEven;
    }
    
    public boolean isOdd(){
    boolean isOdd = false;
    if (this.ValueOfInt%2!=0){
        isOdd = true;
    } return isOdd;
    }
    
    public void prettyPrint(){
        System.out.println(ValueOfInt);
    }
    
    public String toString1(){
         String typeface = ValueOfInt+ "";
         return typeface;
    }
    
}
