public class Rectangle {
    private float longeur;
    private float largeur;

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }
    public float perimetre(){
        return (this.longeur*this.largeur)*2;
    }
    public float aire(){
        return this.longeur*this.largeur;
    }
}
