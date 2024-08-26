public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
        notifyObservers();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }
}