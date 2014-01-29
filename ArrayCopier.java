import java.util.Arrays;

public class ArrayCopier{

public static void main(String[] args){

    copy();
    //method copys the elements from one array (thisSrc) to another (thisDst).

}

public static int[] copy(){
    int[] thisSrc = {1,2,3,4,5,6};
    int[] thisDst = new int[6];
    
    if (thisSrc.length <= thisDst.length){
    int i = 0;
    int a = thisSrc.length;
    for (i = 0; i < a; i++){
        System.out.println("Source: "+thisSrc[i]);
        System.out.println("Destination: "+thisDst[i]);
        thisDst[i] = thisSrc[i];
        System.out.println("Destination: "+thisDst[i]);
    }
    System.out.println(Arrays.toString(thisDst));
    return thisDst;
    }
  
    if (thisSrc.length > thisDst.length){
    int a = thisDst.length;
    int i = 0;
    for (i = 0; i < a; i++){
        System.out.println("Source: "+thisSrc[i]);
        System.out.println("Destination: "+thisDst[i]);
        thisDst[i] = thisSrc[i];
        System.out.println("Destination: "+thisDst[i]);
    }
            }
    
     System.out.println(Arrays.toString(thisDst));
    return thisDst;
    }
}


