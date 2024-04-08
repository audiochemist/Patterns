package N1Ex1;


public class StockAgency {

    private String name;
    private StockBroker broker = new StockBroker();

    public StockAgency(String name){
        this.name = name;
    }

    public void update(String stockChange){
        System.out.println(this.name + " ☭_NOW_☭ " + stockChange);
    }
    public void assignBroker(StockBroker broker){
        this.broker = broker;
    }
}
