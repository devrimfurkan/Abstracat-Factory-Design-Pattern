package yazilimMimarsisiveTasarimi.abstractFactory;

public class CaliforniaPizzaMagzasi extends PizzaMagzasi {
    //ve California pizza dükkanı için de aynı şekilde California tarzı //pizzalar hazırladığımızdan emin olmalıyız.
    protected Pizza pizzaOlustur(String icerik) {
        if (icerik.equals("peynir")) {
            return new CaliforniaUsuluPeynirliPizza();
        } else if (icerik.equals("sebzeler")) {
            return new CaliforniaUsuluSebzeliPizza();
        } else if (icerik.equals("istiridye")) {
            return new CaliforniaUsuluIstiridyeliPizza();
        } else if (icerik.equals("peperoni")) {
            return new CaliforniaUsuluPeperoniliPizza();
        } else return null;
    }
}
