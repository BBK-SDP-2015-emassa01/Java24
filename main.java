public class main{

 
    
    public static void main(String[] args){
    
    Virus newVirus = new Virus();
    
    newVirus.newSecs();
    //newVirus.showVirusCount();
    newVirus.checkVirus();
    //Virus.showVirusCount();
    newVirus.tauntUser();
    newVirus.tauntUser("I mean really....");
    newVirus.newTime(30);
    System.out.println("Is your file infected: " +  newVirus.infectFile("crazyFile") );
    
    
    }
    
   
}