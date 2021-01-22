package yazilimMimarsisiveTasarimi.abstractFactory;

//Bu bölümde ise PizzaIcerikFabrikasi arayüzünü ekleyerek
//Pizzamızın bilesenlerini belirliyoruz.
public class ChicagoPizzaIcerikFabrikasi implements PizzaIcerikFabrikasi {
    public hamur createDough() {
        return new kalinKenarliPizza();
    }

    public sos createSauce() {

        return new erikDomatesliSos();
    }

    public peynir createCheese() {

        return new mozarellaPeyniri();
    }

    public sebzeler[] createVeggies() {
        Sebzeler veggies[] = {new siyahZeytin(),
                new ispanak(),
                new patlica()};
        return sebzeler;
    }

    public peperoni createPepperoni() {

        return new dilimPeperoni();
    }

    public istiridye createClam() {
        return new donmusIstiridye();
    }
}
