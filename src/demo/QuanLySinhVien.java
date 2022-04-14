package demo;

public class QuanLySinhVien {
    private SinhVien[] name;

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(SinhVien[] name) {
        this.name = name;
    }

    public SinhVien[] getName() {
        return name;
    }

    public void setName(SinhVien[] name) {
        this.name = name;
    }

    public void add(SinhVien sinhVien){

    }
    public void update(SinhVien sinhVien){

    }
    public void delete(SinhVien sinhVien,int viTri){

    }
    public SinhVien find(String ten){
        return new SinhVien();
    }
}
