public class dec2bi{
    
    public String decimal2binary(int input2){
    
    String remainder = ""; 

    //int workingIn = input2;
    while (input2!=0){
        
        //workingIn = in;
        
        int digit = input2 % 2; 
        if(digit>0){
            remainder = remainder + "1";
        } 
        else if (digit ==0) {
            remainder = remainder + "0";
        }
        input2 = input2/2;
        }
        //System.out.println(remainder);
       
    return remainder;
    //still need to apply palindrome to reverse the order.
    }
}


