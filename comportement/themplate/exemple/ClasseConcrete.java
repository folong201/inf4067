public class ClasseConcrete extends calculeMontantTtc {

    private int cote;

    public ClasseConcrete(int cote) {
        this.cote = cote;
    }

    public int perimetre() {
        return 4 * cote;
    }

    public int aire() {
        return cote * cote;
    }
}