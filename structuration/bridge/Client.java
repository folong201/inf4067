public class Client {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();
        Shape s2 = new Cicle(new BlueColor());
        s2.colorIt();
    }
}
