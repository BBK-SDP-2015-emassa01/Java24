import java.util.Arrays;

class MatrixChecker{
    private int[] myMatrix ;
    private int[][] myMatrix2;

    
    public boolean isSymmetical(int[] a){
    this.myMatrix=  a;
//    this.myMatrix[3] = 4;
    boolean isSymmetrical = false;
    int i = 0;
    int j = this.myMatrix.length-1;
    if (i<=j){
    if (this.myMatrix[i] == this.myMatrix[j]){
        isSymmetrical = true;
        i++;
        j--;
        System.out.println(isSymmetrical);
        return isSymmetrical;
        
    } else {
        if (this.myMatrix[i] != this.myMatrix[j]){
            isSymmetrical = false;}}}
    //if (isSymmetrical== true){System.out.println(isSymmetrical);}
    //else {System.out.println("Not Symmetrical I'm afraid.");}}
    System.out.println(isSymmetrical);
    return isSymmetrical;
    }
    
    /*public boolean isSymmetical2(int[][] b){
       this.myMatrix2 = b; 
    boolean isSymmetrical = false;
    int j = this.myMatrix2.length-1;
    int k = this.myMatrix2[0].length-1;
    for (int i = 0; i <=j; i++){
    
    if (this.myMatrix2[i][j] == this.myMatrix2[i][k]){
    isSymmetrical = true;
    i++;
    k--;
    j--;
    } else {isSymmetrical = false;}}

        return isSymmetrical;
    }*/
    

   public boolean isSymmetical(int[][] a){
               this.myMatrix2 = a;
    boolean isSymmetrical = true;
    int j = this.myMatrix2.length-1;
    int k = this.myMatrix2[0].length-1;
    System.out.println(j +" "+ k);
    if (j == k){
    for (int i = 0; i <=j; i++){
        for ( int n = 0; n <=k; n++){
            
            if (this.myMatrix2[i][n] != this.myMatrix2[n][i]){
    isSymmetrical = false;
            System.out.println("i, n = "+this.myMatrix2[i][n]);
            System.out.println(" n, i = "+this.myMatrix2[n][i]);}
            } 
}}
    else if (j != k){isSymmetrical = false;}
    //System.out.println(isSymmetrical);
       return isSymmetrical;
        }


public boolean isTriangular(int[][] a){
         this.myMatrix2 = a;
boolean isTriangular = true;

int j = this.myMatrix2.length-1;
int k = this.myMatrix2[0].length-1;

if(j==k){

for(int m = 0; m <=j; m++){
    for (int n = m+1; n <=this.myMatrix2.length-1; n++){
        if (this.myMatrix2[m][n] !=0){
            System.out.println("Not Triangular I'm afraid.");
            isTriangular = false;
        }
    }
}
}
    return isTriangular;
}

public void toStrings(){
    System.out.print("\n \"[");
    for (int i = 0;i <=this.myMatrix2.length-1; i++){
        for (int j = 0; j <=this.myMatrix2.length-1; j++){
        System.out.print(this.myMatrix2[i][j]);
        }
        int j = 0;
        if (i>=0 && i<=this.myMatrix2.length-2){
        if((j >= 0) && (j<= this.myMatrix2.length-1)){ 
        System.out.print(";");
        
        }
        }
    }
    System.out.print("]\" ");
}

public int[][] setColumn(int a, String b){
     
int first = 0;

for (int i = 0; i <=b.length() -1;i++){
    if (b.charAt(i) == ','){
        int pos = i;
        
       String number = b.substring(first,pos);
       int num = Integer.parseInt(number);
       first = pos+1;
        this.myMatrix2[i][a] = num;   
}}
return this.myMatrix2;}

public void prettyPrint(){
    System.out.print("\n\"[");
    for (int i = 0;i <=this.myMatrix2.length-1; i++){
        for (int j = 0; j <=this.myMatrix2.length-1; j++){
        System.out.print("\t"+this.myMatrix2[i][j]);
        }
        int j = 0;
        if (i>=0 && i<=this.myMatrix2.length-2){
        if((j >= 0) && (j<= this.myMatrix2.length-1)){ 
        System.out.print(";\n");
        
        }
        }
    }
    System.out.print("]\" ");
}

}