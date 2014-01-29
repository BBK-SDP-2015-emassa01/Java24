public class NestedLoops{
    
    public static void main(String[] args){

    int rows = 4;
    int columns = 10;
    
    for (int i = 1; i <= rows; i++){
System.out.print(i+ "\t");}
System.out.println("");
    
for ( int i = 1; i <= rows; i++){
System.out.print("X\t");


}
System.out.println("");

for (int i = 0; i <=rows; i++){
    
    for (i = 0; i <=columns; i++){
System.out.println(i+"\t" + Math.pow(i, 2) +"\t"+ Math.pow(i, 3)+"\t"+ Math.pow(i, 4)+"\t");
    
    }


}



    }
}
    
