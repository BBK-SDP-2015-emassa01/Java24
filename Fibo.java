class Fibo{
    
//the Fib sequence is: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55... to the Fib(nth) position.
    private static int fib(int n){
// the n refers to the position in the sequence.
    if ((n == 1)|| (n ==2)){
        return 1;
    }
    else {
        int result = fib(n-1) + fib(n-2);
    //System.out.println(result);
    return result;
    } 
    
    
//public static int fibList(int n){
//to solve this program with an iterative sequence you would need 2 counters, loops and to update the list...

//}
    
    
    
    }
    
    private static void main(String[] args){
    
        //Fibo A = new Fibo();
        
       int finalResult = fib(10);
       System.out.println(finalResult);
    }

}