public class MobileApp implements Observer {
   
    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock price updated to " + stockPrice);
    }
}