public class AdaptRectangle extends Rectangle implements Icarre {

    private float cote;

    public void AdaptRectangle(float cote) {
        this.cote = cote;
    }

    public float perimetre() {
        super.setLongeur(cote);
        super.setLargeur(cote);
        return super.perimetre();
    }

    public float aire() {
         super.setLongeur(cote);
        super.setLargeur(cote);
        return super.aire();
    }


}