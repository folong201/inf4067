public class MonteurPizzaCamer extends MonteurPizza{
    private Pizza pizza = new Pizza();
    public void monterPate() {
        this.pizza.setPate("Fuille de bananier");
    }

    public void monterSauce() {
        this.pizza.setSauce("gombo");
    }

    public void monterGarniture() {
        this.pizza.setGarniture("pueree d'avocat");
    }
    
    public Pizza getPizza() {
        return this.pizza;
    }
    
}
