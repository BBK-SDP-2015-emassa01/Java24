class PowersClass{
    

    public static int pow(int base, int exponent){
        
        if (exponent<1) {
            return 1;//what is this return 1 actually doing???
        }
        else{
            int result = pow(base, exponent - 1) * base;
        return result;   
    }

}
    
    public static void main(String[] args){
    System.out.println(pow(3,1));
    }
}