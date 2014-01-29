

public class Converter {
    dec2bi three = new dec2bi();
 
    palindrome B = new palindrome();
    
public String hex2dec(String x){

    String a = 10+"";
    String b = 11+"";
    String c = 12+"";
    String d = 13+"";
    String e = 14+"";
    String f = 15+"";
    

    
    String hexIn = x;
    int decOut;
    String binOut;
    String runningBinOut = "";
    

    for (int i = 0; i<hexIn.length(); i ++){
    char toConvert = hexIn.charAt(i);
    
     if (toConvert == 'a') { 
         decOut = 10;  
         binOut = B.palin(three.decimal2binary(decOut)); 
         if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         } 
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == 'b') { 
         decOut = 11;  
         binOut = B.palin(three.decimal2binary(decOut)); 
         if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
         runningBinOut = runningBinOut + binOut;}
     if (toConvert == 'c') { 
         decOut = 12;  
         binOut = B.palin(three.decimal2binary(decOut));  
         if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
         runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == 'd') { 
         decOut = 13;  
         binOut = B.palin(three.decimal2binary(decOut));  
         if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
         runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == 'e') { 
         decOut = 14;  
         binOut = B.palin(three.decimal2binary(decOut)); 
         if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
         runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == 'f') { 
         decOut = 15;  
         binOut = B.palin(three.decimal2binary(decOut));  
         if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
         runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '0') { 
         decOut = 0;  
     binOut = B.palin(three.decimal2binary(decOut)); 
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '1') { 
         decOut = 1;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '2') { 
         decOut = 2;  
     binOut = B.palin(three.decimal2binary(decOut)); 
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '3') { 
         decOut = 3;  
         binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '4') { 
         decOut = 4;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '5') { 
         decOut = 5;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '6') { 
         decOut = 6;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '7') { decOut = 7;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '8') { 
         decOut = 8;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }
     runningBinOut = runningBinOut + binOut;}
     
     if (toConvert == '9') { decOut = 9;  
     binOut = B.palin(three.decimal2binary(decOut));  
     if(binOut.length()<4){
             if (binOut.length() == 3){binOut = "0" + binOut;}
             if (binOut.length() == 2){binOut = "00" + binOut;}
             if (binOut.length() == 1){binOut = "000" + binOut;}
             if (binOut.length() == 0){binOut = "0000" + binOut;}
         }runningBinOut = runningBinOut + binOut;}
     
          
    
    }
           
    System.out.println(" the conversion of hexidecimal: " + hexIn + ", to a binary number is: " + runningBinOut + ".");
 

return runningBinOut;
}

}