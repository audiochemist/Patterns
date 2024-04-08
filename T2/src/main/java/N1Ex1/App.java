package N1Ex1;

public class App {
    public static void main(String[] args){


        StockBroker stockBroker1 = new StockBroker();
        StockAgency stockAgency1 = new StockAgency("Wolves of Wall Street");
        StockAgency stockAgency2 = new StockAgency("The best of the best");
        StockAgency stockAgency3 = new StockAgency("Game Freaks");

        stockBroker1.addAgency(stockAgency1);
        stockBroker1.addAgency(stockAgency2);
        stockBroker1.addAgency(stockAgency3);
        stockAgency1.assignBroker(stockBroker1);
        stockAgency2.assignBroker(stockBroker1);
        stockAgency3.assignBroker(stockBroker1);

        stockBroker1.changeStock("Videogames","Stocks have gone up");
        System.out.println("-----------");
        stockBroker1.changeStock("Toys","Stocks have gone down");
        System.out.println("-----------");

        stockBroker1.removeAgency(stockAgency2);

        stockBroker1.changeStock("Cars", "Stocks have raised dramatically!!");
    }
}
