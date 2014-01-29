public class RecursiveMethods2{


    public int factorialList(int n){
        int value ;
        int fullValue = 0;
    int i = n;
    for ( i = n; i >=1; i--){ 
        value = n;
        fullValue = value;
        fullValue = fullValue *value;
        System.out.println(fullValue);
        n = n-1;

    }
    return fullValue;   
}

}//very difficult to do this iteratively! Easier to do it recursively.