class Commodity{
public static void main(String[] arguments){
 String command = "Buy";
 int balance = 550;
 int quantity = 54;
 
 switch(command){
 
     case "Buy":
         quantity = quantity+5;
         break;
     case "Sell":
         quantity = quantity - 5;
         break;
     default:
         break;
         
         // could also use a ternary operator...command would have to be saved as an int.
 }
    System.out.println("quantity = " + quantity);
   
 }
}