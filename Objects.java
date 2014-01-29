import java.util.Scanner;


public class Objects{

public static void main(String[] args){
    
    palindrome A = new palindrome();


    bi2dec one = new bi2dec();
    dec2bi two = new dec2bi();

    
    Scanner input = new Scanner(System.in);
    
    System.out.println("What would you like to do?");
    System.out.println("Convert Binary Number to Decimal Number? \t Press \'1\'");
    System.out.println("Convert Decimal Number to Binary Number? \t Press \'2\'");
    
    int input3 = input.nextInt();
    
    if(input3 == 1){
    System.out.println("Enter a binary number");
    Scanner input2 = new Scanner (System.in);
    String input4 = input2.nextLine();
    one.binary2decimal(input4);
    }
    
    if(input3 == 2){
    System.out.println("Enter a decimal number");
    Scanner input6 = new Scanner (System.in);
    int input5 = input6.nextInt();
    String revBin = two.decimal2binary(input5);
    A.palin(revBin);
    }
}
}