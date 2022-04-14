package casting;

import java.util.ArrayList;
import java.util.List;

public class Nhansu {
    private int id;
    private String name;
    private int tuoi;

    public Nhansu() {
    }

    public Nhansu(int id, String name, int tuoi) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Nhansu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
class Baove extends Nhansu{
    public void trongcoi(){
        System.out.println("trông xe");
    }
}
class GiamDoc extends Nhansu{
    public void timNguoi(){
        System.out.println("tìm nhân viên");
    }
}
class QuanLy{
    public void them(Nhansu nhansu){

    }

    public static void main(String[] args) {
        Nhansu nhansu = new Baove();
        ((Baove)nhansu).trongcoi();
        List<Nhansu> list = new ArrayList<>();
        list.add(new Baove());
        list.add(new Nhansu());
    }
}
