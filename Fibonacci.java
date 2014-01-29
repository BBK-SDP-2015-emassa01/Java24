 class Fibonacci{

public static int Factorials(int number){
if (number ==1) {return number;}
else {
int result = Factorials(number -1)* number;
return result;
}
}

public static int fibo(int num){
if(num ==1|| num ==2){return 1;}
else {
int result = fibo(num-1)+ fibo(num-2);
        return result;
}
}

public static int mcCarthy91(int n) { 
    if (n > 100) {
            return n - 10;
        } else {
   
return mcCarthy91(mcCarthy91(n+11)); 
    }
}

 public static boolean palindrome(String str){
     return palindrome(str,  0, str.length()-1);
 }
 
   
 public static boolean palindrome(String str , int low, int high){
 
  char i = str.charAt(low);
  //System.out.println(low);
  
  char j = str.charAt(high);
  //System.out.println(high);
 
 if (high<=low){return true;}
 else if (i!= j){return false;
 }
 
 else return palindrome(str, low+1, high-1);

 }
 
 public static double PaperSize(String s){
     double paperSize = Double.parseDouble(s); 
     double check = paperSize%2;
if(check ==0) {return PaperSizeEven(paperSize);}
 else {return PaperSizeOdd(paperSize);}
 }
  public static double PaperSizeEven(double paperSize){
     
      if ( paperSize > 18){
             return 0.8212890625;}
     
             //return 0.41064453125;
         
         else {
             double size =  2* PaperSizeEven(paperSize+2);
             return size;  
     }
  }
    public static double PaperSizeOdd(double paperSize){
     
      if ( paperSize > 21){
             return 0.41064453125;}         
         else {
             double size =  2* PaperSizeOdd(paperSize+2);
             return size;  
     }
  } 
     public static double PaperSizeb(String s){
     double paperSize = Double.parseDouble(s); 
     double check = paperSize%2;
if(check ==0) {return PaperSizeEvenb(paperSize);}
 else {return PaperSizeOddb(paperSize);}

     }
     public static double PaperSizeEvenb(double paperSize){
     
      if ( paperSize > 20){
             return 0.58056640625;}
     
             //return 0.41064453125;
         
         else {
             double size =  2* PaperSizeEvenb(paperSize+2);
             return size;  
     }
  }
    public static double PaperSizeOddb(double paperSize){
     
      if ( paperSize > 17){
             return 1.1611328125;}         
         else {
             double size =  2* PaperSizeOddb(paperSize+2);
             return size;  
     }
  } 

 public static void main(String[] args)
{
    //int finalVal = Factorials(9);
    //int finalFibo = fibo(4);
    //int mcCarthy = mcCarthy91(88);
    //boolean pali = palindrome("helllllleh");
    double paper = PaperSize("7");
    double paper2 = PaperSizeb("6");
    
   // double paper2 = PaperSize("5");
  //  double Paper2 = PaperSize(paper+1);
   // String paper2 = "" + Paper2;
    
//System.out.println("Factorial: "+ finalVal);
//System.out.println("Fibonacci: "+ finalFibo);
//System.out.println("mcCarthy: "+ mcCarthy);
//System.out.println("palindrome: "+ pali);
    int paperInt = (int) paper;
    int paperInt2 = (int) paper2;
    
    //int paperInt2 = (int) paper2;
System.out.println("papersize: "+ paperInt+ " x "+ paperInt2);
//System.out.println(" x papersize: "+ PaperSize("4"));

}
 }

