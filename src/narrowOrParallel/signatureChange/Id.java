package narrowOrParallel.signatureChange;

public class Id {
    private int id;

    public Id(int id) {
        this.id = id;
    }

    public boolean isEqual (int id) {
        return (this.id == id);
    }
}
