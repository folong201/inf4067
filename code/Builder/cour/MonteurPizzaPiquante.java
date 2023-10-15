public class MonteurPizzaPiquante  extends MonteurPizza{
    private Pizza pizza = new Pizza();
    public void monterPate() {
        this.pizza.setPate("feuilletée");
    }

    public void monterSauce() {
        this.pizza.setSauce("piquante");
    }

    public void monterGarniture() {
        this.pizza.setGarniture("pepperoni+salami");
    }
    
    public Pizza getPizza() {
        return this.pizza;
    }
}
