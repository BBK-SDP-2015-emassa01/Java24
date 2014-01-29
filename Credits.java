class Credits {
public static void main(String[] arguments){
    String title = "The Piano";
    int year = 1983;
    String director = "Jame Campion";
    String directorU = director.toUpperCase();
    String role1  = "Ada";
    String actor1 = "Holly Hunter";
    String actor1U = actor1.toUpperCase();
    String role2 = "Baines";
    String actor2 = "Harvy Keitel";
    String actor2U = actor2.toUpperCase();
    String role3 = "Stewart";
    String actor3 = "Sam Neill";
    String actor3U = actor3.toUpperCase();
    String role4 = "Flora";
    String actor4 = "Anna Paquin";
    String actor4U = actor4.toUpperCase();
    
    //display
    
    System.out.println(title + "(" + year + ") \n" + "A " + director.toUpperCase() +
            " film \n\n" + " staring " + actor1U + " as " + role1 + "\n \t "
                    + actor2U + " as " + role2 + "\n\t "+ actor3U + " as " 
            + role3 + "\n \t "+ actor4U + " as " + role4);

    
  }
}