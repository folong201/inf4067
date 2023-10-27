
import java.util.ArrayList;

public class Dossier implements Fichier {
    public String type;
    public String nom;

    public Dossier(String nom) {
        this.nom = nom;
        this.type = "dossier";
    }

    public ArrayList<Fichier> elements = new ArrayList<Fichier>();

    public void decrire() {
        System.out.println(this.nom + this.type.toString());
        for (Fichier fichier : elements) {
            fichier.decrire();
        }
    }

    public void ajouter(Fichier fichier) {
        elements.add(fichier);
    }

    public void suprimer(int fichier) {
        elements.remove(fichier);
    }

    public Fichier obtenir(int index) {
        return elements.get(index);
    }

}
