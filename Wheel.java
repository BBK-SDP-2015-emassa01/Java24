class Wheel{
public static void main(String[] args){

    String phrase[] = {"hello my name is esha", 
        "this is a test to see if i understand arrays", 
        "i hope this is simple enough"
};

    int[] letterCount = new int[26];
for (int i = 0; i <phrase.length; i++){
    String phraseAtThisMoment = phrase[i];
    char[] lettersAtThisMoment = phraseAtThisMoment.toCharArray();
    for (int i2 = 0; i2 <lettersAtThisMoment.length; i2++){
    char letter = lettersAtThisMoment[i2];
        if((letter >= 'a') & (letter<= 'z')){//only works for lower case letters as the value assigned by unicode is different.
            letterCount[letter - 'a']++;
        }
    }
    
    for (char place = 'a'; place <= 'z'; place++){
        System.out.print("\n"+ place + " : " + letterCount[place - 'a'] );
    
    }
    
}

}

}