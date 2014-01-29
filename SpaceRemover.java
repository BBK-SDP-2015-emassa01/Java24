
import java.util.Arrays;

class SpaceRemover{
public static void main(String[] args){

String reindeer = "Rudolph the red-nosed Reindeer";
char[] charReindeer= reindeer.toCharArray();

for (int i = 0; i < charReindeer.length; i++){
    char placeHolder = charReindeer[i];
if(charReindeer[i] == ' '){
charReindeer[i] = '.';
}       
}
System.out.println(charReindeer);
 Arrays.sort(charReindeer);
 System.out.println(charReindeer);
 
}
}

