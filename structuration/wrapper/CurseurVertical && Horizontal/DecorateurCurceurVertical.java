public class DecorateurCurceurVertical extends DecorateurFenetre {

    DecorateurCurceurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    public void dessiner() {
        super.dessiner();
        System.out.println("suplement dessin pour le curseur vertical");
    }

    public void decrire() {
        super.decrire();
        System.out.println("suplment description pour le curseur vertical");
    }

}
