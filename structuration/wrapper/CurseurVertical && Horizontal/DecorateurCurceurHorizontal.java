public class DecorateurCurceurHorizontal  {
 DecorateurCurceurVertical fenetre;
   public DecorateurCurceurHorizontal(DecorateurCurceurVertical fenetre) {
       this.fenetre = fenetre;
    }

    public void dessiner() {
        fenetre.dessiner();
        System.out.println("suplement desin pour le curseur horizontal");
    }

    public void decrire() {
        fenetre.decrire();
                System.out.println("suplement description pour le cusceur Horizontal");
    }

}
