public class Integer2{
private int value;


//returns the value of this number as an int, a getter. 

public int getValue(){
return value;
}

//setValue(int): a setter.
public int setValue(int value){
    this.value = value;
return value;
}
//isEven(): returns true if the number is even, false otherwise. 


boolean isEven = true;
public boolean isEven(){
     if (value %2 != 0) { isEven = false;
    }
return isEven;
}

//isOdd(): the opposite.

boolean isOdd = true;
public boolean isOdd(){
    if(value%2==0){
        isOdd = false;
    }
return isOdd;
}

//prettyPrint(): prints the value of the integer on the screen. 

public void prettyPrint(){
System.out.println("The number is: " + value);
}

//toString(): returns a String equivalent to the number.
public String tostring(){
String s = value + "";
return s;
}    

}