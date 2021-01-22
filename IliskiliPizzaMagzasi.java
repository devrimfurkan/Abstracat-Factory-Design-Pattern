package yazilimMimarsisiveTasarimi.abstractFactory;

//Burada nasıl bir usülde pizza isteyeceğimizi olusturuyoruz.
public class IliskiliPizzaMagzasi {
    public Pizza pizzaOlustur(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            //Tüm NY usülü pizzaları hazırlar
            if (type.equals("peynir")) {
                pizza = new NYStylePeynirliPizza();
            } else if (type.equals("sebze")) {
                pizza = new NYStylePeynirliPizza();
            } else if (type.equals("istiridye")) {
                pizza = new NYStylePeynirliPizza();
            } else if (type.equals("peperoni")) {
                pizza = new NYStylePeynirliPizza();
            }
        } else if (style.equals("Chicago")) {
            //Tüm Chicago usülü pizzaları hazırlar
            if (type.equals("peynir")) {
                pizza = new ChicagoStylePeynirliPizza();
            } else if (type.equals("sebze")) {
                pizza = new ChicagoStylePeynirliPizza();
            } else if (type.equals("istiridye")) {
                pizza = new ChicagoStylePeynirliPizza();
            } else if (type.equals("peperoni")) {
                pizza = new ChicagoStylePeynirliPizza();
            }
        } else {
            System.out.println("Hata: Yanlis Tuslama");
            return null;
        }
        pizza.hazirla();
        pizza.firinla();
        pizza.dilimle();
        pizza.paketle();
        return pizza;
    }
}
