public class CableModem extends Modem{
    
        String method = "cable connection";
        
        public void Connect(){
        System.out.println("Connecting to the internet......" + "\n" + " Using a" + method);
        
        }
        public void LoseConnection(){
    
    System.out.println("Connection too slow.....\n disconnecting."
    );
        }
    }

