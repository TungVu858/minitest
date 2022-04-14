package demo;

public class SinhVien {
    private String name;
    private int id;
    private int lop;

    public SinhVien() {
    }

    public SinhVien(String name, int id, int lop) {
        this.name = name;
        this.id = id;
        this.lop = lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLop() {
        return lop;
    }

    public void setLop(int lop) {
        this.lop = lop;
    }
}
