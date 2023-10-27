public class FichierPdf implements Fichier {
    public String type;
    public String nom;

    public FichierPdf(String nom) {
        this.nom = nom;
        this.type = ".pdf";
    }

    public void decrire() {
        System.out.println(this.nom + this.type.toString());
    }

    public void ajouter(Fichier fichier) {

    }

    @Override
    public void suprimer(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suprimer'");
    }

    @Override
    public Fichier obtenir(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenir'");
    }

}
