public class RecursiveMethods{

public int factorial2(int n){
int result;
if (n==1){return 1;}
else { result = (n * (factorial2(n -1)));
System.out.println(result);
return result;

}

}
}