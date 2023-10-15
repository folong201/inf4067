public class MonteurPizzaReine extends MonteurPizza{
    private Pizza pizza = new Pizza();
    public void monterPate() {
        this.pizza.setPate("croisée");
    }

    public void monterSauce() {
        this.pizza.setSauce("douce");
    }

    public void monterGarniture() {
        this.pizza.setGarniture("jambon+champignon");
    }
    
    public Pizza getPizza() {
        return this.pizza;
    }
}
