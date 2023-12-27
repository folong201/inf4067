public abstract class Commande {

    public float montantHt;
    private float montantTva;
    private float montantTtc;

    public Commande(float montantHt) {
        this.montantHt = montantHt;
        this.montantTva = calculeTva();
        this.montantTtc = montantHt + montantTva;
    }
 

    public void setMontantHt(float montantHt) {
        this.montantHt = montantHt;
        this.montantTva = calculeTva();
        this.montantTtc = montantHt + montantTva;
    }
 

    protected abstract float calculeTva();

    public void affiche() {
        System.out.println("Montant HT: " + montantHt);
        System.out.println("Montant TVA: " + montantTva);
        System.out.println("Montant TTC: " + montantTtc);
    }
}
