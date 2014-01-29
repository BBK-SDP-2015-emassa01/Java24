public class PalinRecurr{


    public static boolean palindromeR(String s){
        
        return palindromeR( s, 0, s.length()-1);
    
    }//this is one method.
    
    public static boolean palindromeR(String s, int i, int j){
        if (j<=i){ return true;}
        
        else if (s.charAt(i) != s.charAt(j)){return false;}
        
        else return palindromeR(s, i+1, j-1);
    
    }
      
    
 
           
public static void main(String[] args){
System.out.println(palindromeR("heheh"));

}
}




