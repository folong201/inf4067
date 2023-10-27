public class DocumentPdf extends ComposantPdf implements Document{
    private String contenu;
    public DocumentPdf(String contenu){
        super();
    }
    public int imprime(){
        System.out.println("Impression du document PDF");
        this.pdfEnvoieImprimante();
        return 0;
    }
    
    public int setContenu(String contenu) {
        System.out.print("je set le contenu");
        this.pdfFixeContenu(contenu);
        this.contenu = contenu;
        return 1;
    }
    
    public int dessine() {
        System.out.print("je desine allors");
        this.pdfTermineAffichage();
        return 1;
    }
}