
public class FiichierTxt implements Fichier {

    public String type;
    public String nom;
    public FiichierTxt (String nom){
        this.nom = nom;
        this.type = "txt";
    }
    public void decrire() {
        System.out.println(this.nom + this.type.toString());
       
    }

    public void ajouter(Fichier fichier) {
        throw new UnsupportedOperationException("Unimplemented method 'obtenir'");

    }

    public void suprimer(int index) {
    }

    public Fichier obtenir(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenir'");
    }

}
