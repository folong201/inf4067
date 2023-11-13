

public class Client {
    public static void main(String[] args) {
        DecorateurCurceurVertical fe = new DecorateurCurceurVertical(new FennetreSimple());
        fe.decrire();
        fe.dessiner();
    }
}
