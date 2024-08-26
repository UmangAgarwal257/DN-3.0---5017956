public class TestLogger {
 public static void main(String[] args) {
     Logger logger1 = Logger.getInstance();
     Logger logger2 = Logger.getInstance();

     logger1.log("This is a singleton logger instance.");

     if (logger1 == logger2) {
         System.out.println("Both logger instances are the same.");
     } else {
         System.out.println("Logger instances are different.");
     }
 }
}