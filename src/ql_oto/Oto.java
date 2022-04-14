package ql_oto;

public class Oto extends PhuongTien implements Comparable<Oto> {
    private int soCho;

    public Oto() {
    }

    public Oto(String hang, String color, String name, int price, int soCho) {
        super(hang, color, name, price);
        this.soCho = soCho;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public String toString() {
        return "Oto{" + "Name = " + getName()+
                " ,Giá = " + getPrice()+
                " ,soCho=" + soCho +
                '}';
    }

    @Override
    public int compareTo(Oto o) {
        return this.getPrice()-o.getPrice();
    }
}
