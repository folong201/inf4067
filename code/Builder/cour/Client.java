public class Client {
    public static void main(String[] args) {
        MonteurPizzaPiquante monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizzaReine monteurPizzaReine = new MonteurPizzaReine();

        Directeur directeur = new Directeur(monteurPizzaPiquante);

        Pizza pizzaPiquante = directeur.construirePizza();
        pizzaPiquante.print();

        directeur = new Directeur(monteurPizzaReine);
        Pizza pizzaReine = directeur.construirePizza();

        pizzaReine.print();
    }
}
