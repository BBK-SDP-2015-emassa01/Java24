class Squares {
  public static void main (String[] arguments){
  int x = 5;
  int y = 12;
  
  int squareXY = ((x*x) + (y*y));
  
  System.out.println(x + " squared plus " + y + " squared = "+  squareXY);
  
  char myChar = 'w';//wont take 'woah as a char type as it's a string not a char if more than one letter.
  System.out.println(myChar + "\n \f \" \' \t \b \r "); //plus some special characters.    
  
  System.out.println("Is my favourite instrument the same as your guess?");
  }
    
}