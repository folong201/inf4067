public class Client {
    public static void main(String[] args) {
        // Création des objets Texte
        Texte p1 = new Paragraphe("parahraphe 1");

        // Création d'un objet Composite
        Texte s1 = new Section();
        s1.ajoute(p1); 
        System.out.println(s1.longeur());
    }
}
