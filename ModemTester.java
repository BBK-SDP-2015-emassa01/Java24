public class ModemTester{

    //static keyword is part of an element that creates class variables.
static int modemtest = 0;

public static void main(String[] args){
    
int z = 1;
for (z = 1; z < 5; z++){
    modemtest++;
    
    CableModem cable = new CableModem();
    DslModem dsl = new DslModem();
    Disconnect loseConnect = new Disconnect();
    
    cable.speed = 5;
    dsl.speed = 10;
    
    //System.out.println("Connecting to the Cable");
    //cable.displaySpeed();
    //cable.Connect();
    loseConnect.LoseConnection(cable.speed);
    
    //System.out.println("Connecting to the DSL");
    //dsl.displaySpeed();
    //dsl.Connect();
}
        System.out.println(modemtest);

}

}