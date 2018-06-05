package old.company;

public class Test {
    private int trololo;
    private String trololol;
    private boolean trol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (trololo != test.trololo) return false;
        if (trol != test.trol) return false;
        return trololol != null ? trololol.equals(test.trololol) : test.trololol == null;
    }

    @Override
    public int hashCode() {
        int result = trololo;
        result = 31 * result + (trololol != null ? trololol.hashCode() : 0);
        result = 31 * result + (trol ? 1 : 0);
        return result;
    }
}
