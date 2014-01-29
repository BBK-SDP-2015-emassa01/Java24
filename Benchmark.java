class Benchmark{
public static void main(String[] arguments){

    long timeNow = System.currentTimeMillis();
    long endTime = timeNow + 60000;
    long index = 0;
    
    while(true){
    double x = Math.sqrt(index);
    long now = System.currentTimeMillis();
    if(now>endTime){
    break;//ends loop entirely, the 'continue' key word will skips to the next g-round of the loop.
    }
    index++;
    }
System.out.println(index);
}

}