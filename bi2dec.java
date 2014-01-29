



public class bi2dec{
        double decValue ;
        double decimalValueCurrent;
       
        String singleNum;
    
    public double binary2decimal( String input1){
   // int y = Integer.parseInt(x);
        String stringInput = input1; 
        //int intInput = Integer.parseInt(stringInput);
        int lengthOfBinary = stringInput.length();
        //System.out.println("The length of your binary number is:" + lengthOfBinary);
        //System.out.println(stringInput.substring(0,1));
        //System.out.println("Calculating decimal value....");
        //char[] y = in.toCharArray();
        //int SumDecVal = 0; 
        //int decVal = 1;
        int k = lengthOfBinary;
        double l = (double) k-1;
        
        int length = lengthOfBinary;
        int i;
        for (i = 0; i<length ;i++){
            int j = i +1;
            singleNum = stringInput.substring(i, j);
            //System.out.println(i + " to "+ j+ "number is: "+singleNum);
            int singleInput = Integer.parseInt(singleNum);
            //temp.base = power.powerCalc(2,i); 
            //System.out.println(temp.powerCalc(2, i));

            decimalValueCurrent = singleInput * (Math.pow(2,l) );
            decValue = decValue+decimalValueCurrent;
            //System.out.println("decimalValue: " + decimalValue);
            //System.out.println("decValue: "+ decValue);
            l--;
            }
        
        //int decVal = y[i]* (2^lengthOfBinary);}
        //SumDecVal = SumDecVal+decVal;
       //i++;
       //lengthOfBinary--;

       //System.out.println("decimalValue: " + decimalValue);
       System.out.println("The Decimal Value is: "+ decValue);
       
        return decValue;
    } 

    }


