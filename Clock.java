import java.util.*;

class Clock{
public static void main(String[] arguments){
//get current time and date
    Calendar now = Calendar.getInstance();
    int hour = now.get(Calendar.HOUR_OF_DAY);
    int minute = now.get(Calendar.MINUTE);
    int month = now.get(Calendar.MONTH)+1;
    int day = now.get(Calendar.DAY_OF_MONTH);
    int year = now.get(Calendar.YEAR);
    
    //display a greeting
    if(hour<12){
    System.out.println("Morning!");
    }else if (hour<17){
    System.out.println("Afternoon!");
    }else {
    System.out.print("Evening!");
    }
//minutes
    System.out.print(" It's ");
    if (minute!=0){
        System.out.print(minute);
        if(minute == 1){System.out.print("minute");
        } else {
            System.out.print(" minutes");
        }
    System.out.print(" past ");
    }
 
//hour
    System.out.print((hour >12)? (hour - 12): hour);
    System.out.print(" o' clock on ");
    System.out.print( day );

    //month
    
    switch(month){
        case 1:
            System.out.println("jan ");
            break;
        case 2:
            System.out.println("feb ");
            break;
        case 3:
            System.out.println("march ");
            break;
        case 4:
            System.out.println("april ");
            break;
        case 5:
            System.out.println("may ");
            break;
        case 6:
            System.out.println("june ");
            break;
        case 7:
            System.out.println("july ");
            break;
        case 8:
            System.out.println("aug ");
            break;
        case 9:
            System.out.println("sep ");
            break;
        case 10:
            System.out.print(" Oct");
            break;
        case 11:
            System.out.println("nov ");
            break;
        case 12:
            System.out.println("dec ");
            break;
    }
    
    //display all
    System.out.println( ", " + year + ".");
}
}