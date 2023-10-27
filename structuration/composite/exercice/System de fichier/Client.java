public class Client {
    public static void main(String[] args) {
        // Création des objets Texte
        Fichier pdf = new FichierPdf("fichier pdf");
        Fichier txt = new FiichierTxt("fichier text");

        // Création d'un objet Composite
        Dossier dossier = new Dossier("dossier");
        dossier.ajouter(pdf);
        dossier.ajouter(txt);
        pdf.decrire();
        txt.decrire();
        dossier.decrire();
    }
}
