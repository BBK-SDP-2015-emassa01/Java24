class Palindromes{
    
    public static boolean isPalindrome(String s){
    return isPalindrome( s, 0, s.length()-1);
    }
    

static boolean isPalindrome(String s, int i, int j){
if(j<=i){return true;}
else if (s.charAt(i) != s.charAt(j)){return false;}
else return isPalindrome(s, i+1, j-1);
}

public static void main(String[] args){

System.out.println( isPalindrome("helloolleh"));
}


}