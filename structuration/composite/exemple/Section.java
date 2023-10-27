
import java.util.ArrayList;

public class Section implements Texte {
    // list of Texte object of the section class
    public ArrayList<Texte> textes = new ArrayList<Texte>();

    public Section() {
    }

    public void ajoute(Texte texte) {
        // ajouter un nouveau texte dans la liste des textes
        this.textes.add(texte);

    }

    public void retrait(int index) {
        // retirer un texte de la liste des textes top
        this.textes.remove(index);
    }

    public int longeur() {
        int longueur = 0;
        for (Texte texte : textes) {
            longueur += texte.longeur();
        }
        return longueur;
    }

}