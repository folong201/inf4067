public interface Image {

    String getNom();

    void setNom(String nom);

    String getFormat();

    void setFormat(String format);

    void compresser();

    void appliquerFiltre(Filtre filtre);
}
