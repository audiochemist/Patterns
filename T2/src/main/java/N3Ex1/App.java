package N3Ex1;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Article> articleList = new ArrayList<>();
        ArrayList<Converter> converterList = new ArrayList<>();

        PriceList pricesList = new PriceList(articleList, converterList);

        Article article1 = new Article("Toy33", 10);
        Article article2 = new Article("Sardines", 20);

        pricesList.addArticles(article1);
        pricesList.addArticles(article2);


        Converter moneyConverter = new EuroConverter();
        Converter moneyConverter2 = new RubloConverter();

        pricesList.addConverters(moneyConverter);
        pricesList.addConverters(moneyConverter2);

        pricesList.listingArticles(articleList, converterList);


    }
    }



