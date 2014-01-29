class printNum{
    

public static void main(String[] args){
printNum a = new printNum();

    a.printNumbers(6);
}
    void printNumbers(int n){
    if (n<=0){
        return;
    }
    System.out.println(n);
    System.out.println(n-2);
    System.out.println(n-3);
    System.out.println(n);

    }
}

