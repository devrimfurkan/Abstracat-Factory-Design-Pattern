package yazilimMimarsisiveTasarimi.abstractFactory;

//Bu pizza magzaları da tıpkı NY pizza magzası gibidir
//tek farkı farklı çeşitte pizza oluşturmalarıdır.

public class ChicagoPizzaMagzasi extends PizzaMagzasi {
    //Chicago pizza dükkanı için Chicago tarzı pizzalar hazırladığımızdan //emin olmalıyız.
    protected Pizza pizzaOlustur(String icerik) {
        if (icerik.equals("peynir")) {
            return new ChicagoUsuluPeynirliPizza();
        } else if (icerik.equals("sebzeler")) {
            return new ChicagoUsuluSebzeliPizza();
        } else if (icerik.equals("istiridye")) {
            return new ChicagoUsuluIstiridyeliPizza();
        } else if (icerik.equals("peperoni")) {
            return new ChicagoUsuluPeperoniliPizza();
        } else return null;
    }
}

