package N3Ex1;

import java.util.ArrayList;

public class PriceList {


    private ArrayList<Article> articleList;
    private ArrayList<Converter> converterList;


    public PriceList(ArrayList<Article> articleList, ArrayList<Converter> converterList) {
        this.articleList = articleList;
        this.converterList = converterList;
    }


    public void addArticles(Article article) {
        articleList.add(article);
    }


    public void addConverters(Converter moneyConverter) {
        converterList.add(moneyConverter);
    }


    public void listingArticles(ArrayList<Article> articleList, ArrayList<Converter> converterList) {

        for (Article article : articleList) {
            for (Converter converter : converterList) {
                System.out.println("The article " + article.getName() + " costs " + article.getPriceEuros() + " american dollars, "
                        + ", that is " + converter.converter(article.getPriceEuros()) + " " + converter.getName());
            }
        }
    }
}
