public class ComposantPdf {
   public void pdfFixeContenu(String contenu){
        System.out.println("Fixe le contenu du document PDF : " + contenu); 
    }
    public void pdfPrepareAffichage(){
        System.out.println("Prépare l'affichage du document PDF"); 
    }
    public void pdfRafraichit(){
        System.out.println("Rafraîchit l'affichage du document PDF"); 
    }
    public void pdfTermineAffichage(){
        System.out.println("Termine l'affichage du document PDF"); 
    }
    public void pdfEnvoieImprimante(){
        System.out.println("Envoie le document PDF à l'imprimante"); 
    }
}
