public class Paragraphe implements Texte{
    public int longeur;
    public String texte;

    public Paragraphe(String texte) {
        this.texte = texte;
        this.longeur = texte.length();
    }

    public int longeur() {
        System.out.println(longeur);
        return longeur;
    }

    
    public void ajoute(Texte txt) {
    }

    
    public void retrait(int index) {
    }
}
