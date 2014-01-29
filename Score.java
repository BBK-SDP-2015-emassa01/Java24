class Score {
public static void main(String[] arguments){
int grade = 31;
char letterGrade = '.';

if(grade>70){
    letterGrade = 'A';
    System.out.println("well done mate! a first");
}
else if(grade>60){
    letterGrade = 'B';
    System.out.println("2.1");
}
else if(grade>50){
    letterGrade='C';
    System.out.println("2.2");
}
else if(grade>40){
    letterGrade='D';
    System.out.println("just passed");
}
else {
     letterGrade='F';
    System.out.println("failed");
}

switch(letterGrade){
    case 'A':
        System.out.println("A");
        break;
    case 'B':
            System.out.println("B");
        break;
    case 'C':
        System.out.println("C");
        break;
    case 'D':
        System.out.println("D");
        break;
    default:
        System.out.println("fail");
        break;
}

}
}