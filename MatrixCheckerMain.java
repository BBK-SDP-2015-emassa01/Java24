import java.util.Arrays;

class MatrixCheckerMain{

public static void main(String[] args){
MatrixChecker myMatrix1 = new MatrixChecker();   

//FOR THE MATRIX Q
/*Matrix myMatrix = new Matrix(7,5);
myMatrix.setElement(2,2,4);
myMatrix.setRow(3, "1,2,3,4,5");
myMatrix.setColumn(3, "1,2,3,4,5,6,7");
myMatrix.toStrings();
myMatrix.prettyPrint();
*/

//FOR THE 'ISSYMMETRICAL' Q.

//int[] testerSymm = {2,2,2,4};
int[][] testerSymm2 = {{1,0,0},{1,1,1},{1,1,1}};

//System.out.println(myMatrix1.isSymmetical(testerSymm2));

//FOR THE 'ISTRIANGULAR' Q.
System.out.println(myMatrix1.isTriangular(testerSymm2));

    
    
    }

}