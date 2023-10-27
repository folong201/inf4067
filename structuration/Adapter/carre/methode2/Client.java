public class Client {
    public static void main(String[] args) {
        AdaptRectangle r = new AdaptRectangle();
        r.AdaptRectangle(7);
        System.out.println("Perimetre: " + r.perimetre());
        System.out.println("Aire: " + r.aire());
    }
}