public class Client {
    public static void main(String[] args) {
        Commande commandeCameroun = new CommandeCameroun(100.0f);
        commandeCameroun.affiche();
 
        Commande commandeGabon = new CommandeGabon(100.0f);
        commandeGabon.affiche();
    }
}