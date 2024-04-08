package N1Ex1;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
    private List<StockAgency> agencyList = new ArrayList<>();
    private String stock;

    public void addAgency(StockAgency sa){
        agencyList.add(sa);
    }
    public void removeAgency(StockAgency sa){
        agencyList.remove(sa);
    }

    public void notifyStockAgency(String msg){
        agencyList.forEach(sa -> {sa.update(msg);});
    }

    public void changeStock(String stockName, String message){
        this.stock = stockName;
        notifyStockAgency(stockName + ": " + message);
    }
}
