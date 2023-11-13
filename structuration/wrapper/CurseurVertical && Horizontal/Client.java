

public class Client {
    public static void main(String[] args) {
        DecorateurCurceurVertical fv = new DecorateurCurceurVertical(new FennetreSimple());
        DecorateurCurceurHorizontal fe = new DecorateurCurceurHorizontal(fv);
        fe.dessiner();
        fe.decrire();
    }
}
