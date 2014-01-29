import java.util.Scanner; 

  class Employee{
public static void main(String[] args){
    String[] employeeName = new String[4];
    int[] employeeIdArray = new int[4];
    
    
    for (int i = 0; i <4; i++){
      System.out.println("Enter name: ");  
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        employeeName[i] = name;
      System.out.println("Enter ID: ");  
        int ID = input.nextInt();
        employeeIdArray[i] = ID;
    }
    
        for (int i = 0; i <4; i++){
         if (employeeIdArray[i] <= 1000){
                    System.out.println("Employee ID numbers <1000: "+ 
                            employeeIdArray[i]+ "in position: "+ (i+1) + ".");
                }
            }
    
    
    for (int i = 0; i <4; i++){
            if(employeeName[i].charAt(0) == 'j'||employeeName[i].charAt(0) == 'S'||employeeName[i].charAt(0) == 's'||employeeName[i].charAt(0) == 'J'){
                if (employeeIdArray[i] <= 1000){
                    System.out.println("Employee name \'J/j\' or "
                            + "\'S/s\' in Position: " + (i+1)+ "\n" + 
                           "Name:"+ employeeName[i]+"  ID number:"+ 
                            employeeIdArray[i]);
                }
            }
    }
}
  }
    


