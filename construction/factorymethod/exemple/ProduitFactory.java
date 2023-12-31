public class ProduitFactory {
    public static final int TYPE_PRODUITA1 = 1;
    public static final int TYPE_PRODUITA2 = 2;

    public ProduitA getProduitA(int typeProduit) {
        ProduitA produitA = null;
        switch (typeProduit) {
            case 1:
                produitA = new ProduitA1();
                break;
            case 2:
                produitA = new ProduitA2();
                break;
            default:
                throw new IllegalArgumentException("type  de produit incomue");
        }
        return produitA;
    }
}
