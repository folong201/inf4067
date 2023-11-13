
public abstract class DecorateurFenetre {
    Fenetre  fenetre;
    DecorateurFenetre( Fenetre fenetre){
        this.fenetre = fenetre;
    }
    public void dessiner(){
        fenetre.dessiner();
    }
    public void decrire(){
        fenetre.decrire();
    }
}
