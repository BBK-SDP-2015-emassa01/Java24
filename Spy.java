public class Spy {
private static int spyCount = 0;
int ID;

public void Spy(int ID) { 
    this.ID = ID;
    System.out.println("The ID of the spy is: "+this.ID);
    spyCount++;
    System.out.println("SpyCount is now: "+spyCount);
    System.out.println(" ");
}

public void Die(int ID) { 
    this.ID = ID;
    System.out.println("Spy "+this.ID + " has been detected and eliminated. ");
    spyCount--;
    System.out.println("SpyCount is now: "+spyCount);
    System.out.println(" ");
}

public static int getNumberOfSpies() { 
    return spyCount;
}

public static void main(String[] args) {

    Spy newSpy1 = new Spy();
    newSpy1.Spy(10);
    
    Spy newSpy2 = new Spy();
    newSpy2.Spy(20);
    
    Spy newSpy3 = new Spy();
    newSpy3.Spy(30);
    
    Spy newSpy4 = new Spy();
    newSpy4.Spy(40);
    
    Spy newSpy5 = new Spy();
    newSpy5.Spy(50);
    newSpy5.Die(50);
    
}
}
