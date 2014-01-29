public class TowOfHanoi{

  public static int hanoi(int n){
 
  if (n==1) {
      return 1;
  }
  else {
      int result = hanoi(n-1)*2 +1;
//System.out.println(result);
      return result;
  } 
  }
    

  public static void main(String[] args){
  
  int finalResult = hanoi(4);
  System.out.println(finalResult);
  
  }
}

