
import java.util.Arrays;

class Matrix {
    
private int[][] myArray;


//public by default
Matrix(int a, int b){
    this.myArray = new int[a][b];
    for (int i = 0; i<=this.myArray.length-1; i++){
        for(int j = 0; j<=this.myArray[0].length-1; j++){
    this.myArray[i][j]= 1;
}
    }
       System.out.print(" [ ");
    for (int k = 0; k <this.myArray.length; k++){
    for (int l = 0; l <this.myArray[0].length; l++){

        System.out.print( this.myArray[k][l]);
    }
    System.out.println(" ] ");
}
    //System.out.println("] ");
}


public int[][] setElement(int a, int b, int c){
   // if (a<= this.myArray.length-1) {
     //   if (b<= this.myArray.length-1){
    this.myArray[a][b] = c;
    //}
    //}
    //else {this.myArray[a][b] = this.myArray[a][b];}
     for (int i = 0; i <myArray.length; i++){
    for (int j = 0; j <myArray[0].length; j++){

        System.out.print( myArray[i][j]);
    

}
     }
     return this.myArray;
}

public int[][] setRow(int a, String c){
    String b = c+",";
    int start = 0;
    int finish = b.length();
    int placeInArray = -1;
    for (int i = start; i < finish; i++){
        if (b.charAt(i) == ','){
        placeInArray++;
        String toEnter = b.substring(start,i);
        int num2enter = Integer.parseInt(toEnter);
        this.myArray[a][placeInArray] = num2enter;
        start = i+1;
       
        }
    }
   //this.myArray[a][this.myArray[0].length-1] = b.charAt(finish-1);
           System.out.print(" [ ");
    for (int i = 0; i <myArray.length; i++){
    for (int j = 0; j <myArray[0].length; j++){

        System.out.print( myArray[i][j]);
    }
    System.out.println(" ] ");}
return this.myArray;
}
  
    
    
    
    /*int posComma = 0;
    char item = ' ';
    for(int i = 0; i<=b.length();i++){
    if(b.charAt(i) == ','){
          posComma++;}
          
          System.out.println("Number of commas is" +posComma);
          System.out.println("the number of columns in the array is"
                  +this.myArray[0].length);
         
         int[] newRow = new int[posComma+1];
         if (this.myArray[0].length == (posComma+1)){
         for(int j = 0; j<b.length(); j++){
         if(b.charAt(j) == ','){}
         else{
                 item = b.charAt(j);}
         
         for (int k = 0; k<(posComma+1);k++){
                 newRow[k] = item;
             
         }
         this.myArray[a] = newRow;
         
         for (int m = 0; m <newRow.length; m++){
         //for (int n = 0; n <myArray.length; n++){

        System.out.print( newRow[m]);
             return this.myArray;
             }
    }  
}

    }return this.myArray;
}

 
/*int first = 0;
int last;//position of comma
int count = 0;//count number of commas

//if (count+1 == this.myArray.length){
for (int i = 0; i <= b.length()-1; i++){
if (b.charAt(i) == ','){
count++;
//System.out.println(count);
last = i;
String num = b.substring( first,  last);
int number = Integer.parseInt(num);
//System.out.println(num);

this.myArray[a][i] = number;
first = last+1;
}}
//}

    return this.myArray;
}*/


public int[][] setColumn(int a, String c){

    String b = c+",";
int start = 0;
int finish = b.length();
int placeInArray = -1;
for (int i = 0; i < finish;i++){
    if (b.charAt(i) == ','){
        placeInArray++;
       String number = b.substring(start,i);
       int num2add = Integer.parseInt(number);
       start = i+1;
        this.myArray[placeInArray][a] = num2add;   
}}
           System.out.print(" [ ");
    for (int i = 0; i <myArray.length; i++){
    for (int j = 0; j <myArray[0].length; j++){

        System.out.print( myArray[i][j]);
    }
    System.out.println(" ] ");}
return this.myArray;
}

public void toStrings(){
    System.out.print("[");
    for (int i = 0;i <=this.myArray.length-1; i++){
        for (int j = 0; j <=this.myArray[0].length-1; j++){
        System.out.print(this.myArray[i][j]);
        
         
        if ((i < this.myArray.length-1)&&(j ==this.myArray[0].length-1)){System.out.print(";");
        }
       //int j = 0;
       //if (i>=0 && i<this.myArray.length-1){
       //if((j >= 0) && (j< this.myArray.length)){ 
       
       
      // System.out.print(";");
        
        //}
      // }
    }
    
}System.out.print("] ");
System.out.println("");

}


public void prettyPrint(){
        //System.out.print("[");
    System.out.println("");
    for (int i = 0;i <=this.myArray.length-1; i++){
        for (int j = 0; j <=this.myArray[0].length-1; j++){
            
        System.out.print(this.myArray[i][j]);
        
         
        if ((i < this.myArray.length-1)&&(j ==this.myArray[0].length-1)){System.out.println("");
        }
       //int j = 0;
       //if (i>=0 && i<this.myArray.length-1){
       //if((j >= 0) && (j< this.myArray.length)){ 
       
       
      // System.out.print(";");
        
        //}
      // }
    }
    
}System.out.println("");
}
}
    
    /*
    System.out.print("\n\"[");
    for (int i = 0;i <=this.myArray.length-1; i++){
        for (int j = 0; j <=this.myArray.length-1; j++){
        System.out.print("\t"+this.myArray[i][j]);
        }
        int j = 0;
        if (i>=0 && i<=this.myArray.length-2){
        if((j >= 0) && (j<= this.myArray.length-1)){ 
        System.out.print(";\n");
        
        }
        }
    }
    System.out.print("]\" ");
}
}*/


