public class CountVowels {


public static int countVowels(String str){
    char vowel = 0;
   for(int i = 0; i <str.length();i++){
       if(str.charAt(i) == 'A'|| str.charAt(i) == 'E'||str.charAt(i) == 'I'||str.charAt(i) == 'O'
               ||str.charAt(i) == 'U'||str.charAt(i) == 'a'||str.charAt(i) == 'e'
               ||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
    vowel++ ;}
   }
    
    
    return vowel;

}

public static void main(String[] args){

System.out.println("And the number of vowels is...");
System.out.println(countVowels("Hello my name is Esha. Can you help me count the vowels"));
}


}