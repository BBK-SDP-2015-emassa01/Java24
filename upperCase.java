class upperCase{
public static void main (String[] arguments){

    String baines = "Esha Massand";
    String changeBAINES = baines.toUpperCase();
    System.out.println(changeBAINES);
    
    int positionEsha = baines.indexOf("Esha");
    System.out.println(positionEsha);//searches for "Esha" as an index of (or inside) the String baines.

  System.out.println(baines.indexOf("Esha"));//a shorter way to acheive the same as above on one line.
}
}