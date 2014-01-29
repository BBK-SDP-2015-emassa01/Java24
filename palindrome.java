public class palindrome{

public String palin(String text){
    String s = "";
    for (int i = text.length()-1; i >=0; i--){
    s = s+ text.charAt(i);
    }
System.out.println(s);
return s;
}

}