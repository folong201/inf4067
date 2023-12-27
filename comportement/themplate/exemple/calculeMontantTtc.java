public abstract class calculeMontantTtc {
   float montantHt = 0;
    float montantva = 0;
    float montantTtc = 0;

    public void CalculerMontantTtc() {
        this.montantHt = montantHt;
        this.montantva = montantva;

    }
    public void  afficher() {
        System.out.println("Le montant HT est de : " + montantHt);
        System.out.println("Le montant de la TVA est de : " + montantva);
        System.out.println("Le montant TTC est de : " + montantTtc);
    }
}
