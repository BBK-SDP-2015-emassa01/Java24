public class Virus {
    
    public  String filename = null;
    private  int newSeconds= 70;
     public int virusCount;
    String author = "hello";
    //System.out.println(this.author);
    
    
    public void checkVirus(){
    String author= "null";
    System.out.println(this.author);//this doesnt call the 'author' above line. but it calls the Virus.author (the one in the main templace/class.
    }
    
    public void verifyData(int a){
    System.out.println(this.virusCount);
    }
    
    

    public int showVirusCount(){
    verifyData(this.virusCount);
    System.out.println("There are " + virusCount + "viruses");
    //virusCount++;
    System.out.println("virus count "+ this.showVirusCount());
    return virusCount;
    }
    
    
public boolean infectFile(String filename){
boolean infected = true;
if (filename == "crazyFile"){
    infected = false;
    }

return infected;
}

public int newSecs(){
    int x = newSeconds;
    if (newSeconds>=60 && newSeconds <=100){
        newSeconds++;
     x = newSeconds;
    }
       System.out.println(x);
    return x;
}

public int newTime(int newSeconds){
    int newTime = newSeconds+10;
    System.out.println("the new time is " + newTime);
    return newTime; }

public int getSeconds(){
return newSeconds;//can cope with and work with newSeconds because they are in the same class. even thougg newSeconds is a private variable.
}

public void setSeconds(int newValue){
if (newValue>60){
newSeconds = newValue;
}
}

public void tauntUser(String taunt){
    System.out.println(taunt);
}

public void tauntUser(){
System.out.println("That's gotta hurt! ");
}



}
//note that methods can have same names and be 2 methods as long as the 
//have different number of arguments or the inputs are of different variable types

