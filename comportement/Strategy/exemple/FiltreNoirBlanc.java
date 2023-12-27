public class FiltreNoirBlanc implements Filtre {

    @Override
    public String getNom() {
        return "Noir et blanc";
    }

    @Override
    public void appliquer(Image image) {
       System.out.println("Implémenter le filtre noir blanc sur l'image");
    }
}
