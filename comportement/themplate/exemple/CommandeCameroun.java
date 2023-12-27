public class CommandeCameroun extends Commande {

    public CommandeCameroun(float montantHt) {
        super(montantHt);
    }

    @Override
    protected float calculeTva() {
        // Taux de TVA au Cameroun: 19.25%
        return montantHt * 0.1925f;
    }
}
