public class AdaptRectangle implements Icarre {

    private float cote;
    private Rectangle rectangle = new Rectangle();

    public void AdaptRectangle(float cote) {
        this.cote = cote;
    }

    public float perimetre() {
        this.rectangle.setLongeur(cote);
        this.rectangle.setLargeur(cote);
        return this.rectangle.perimetre();
    }

    public float aire() {
         this.rectangle.setLongeur(cote);
        this.rectangle.setLargeur(cote);
        return this.rectangle.aire();
    }


}