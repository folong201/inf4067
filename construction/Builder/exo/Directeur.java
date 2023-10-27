public class Directeur {
    private MonteurPizza monteurPizza;
    public Directeur(MonteurPizza monteurPizza) {
        this.monteurPizza = monteurPizza;
    }
    public Pizza construirePizza() {
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
        return monteurPizza.getPizza();
    }
}