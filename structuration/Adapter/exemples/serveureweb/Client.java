public class Client {
    public static void main(String[] args) {

        DocumentPdf adapteur = new DocumentPdf("contenu pour le pdf");

        adapteur.imprime();

        int resultats = adapteur.dessine();
        System.out.println(resultats);
    }
}
