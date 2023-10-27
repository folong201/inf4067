
public class DocumentHtml implements Document {
    private String contenu;

    public int setContenu(String contenu) {
        this.contenu = contenu;
        return 1;
    }

    public int dessine() {
        System.out.println("okay je desine");
        return 1;
    }

    public int imprime() {
        System.out.println(contenu);
        return 1;

    }

}
