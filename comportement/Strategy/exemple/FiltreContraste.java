public class FiltreContraste implements Filtre {

    @Override
    public String getNom() {
        return "Contraste";
    }

    @Override
    public void appliquer(Image image) {
       System.out.println("Implémenter le filtre contraste sur l'image");
    }
}
