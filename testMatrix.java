import java.util.Arrays;

class testMatrix{
    
public static void main(String[] args){

Matrix myMatrix = new Matrix(4,4);

myMatrix.setElement(1,2,3);

myMatrix.setRow(2, "5,1,1");

myMatrix.setColumn(1, "5,1,1");

myMatrix.toStrings();

System.out.println("");
myMatrix.prettyPrint();
}
//System.out.println();




}



