package ql_oto;

public class XeMay extends PhuongTien implements Comparable<XeMay>{
    private int dungtich;

    public XeMay() {
    }

    public XeMay(String hang, String color, String name, int price, int dungtich) {
        super(hang, color, name, price);
        this.dungtich = dungtich;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    @Override
    public String toString() {
        return "XeMay{" + " Ten = "+getName() +
                " ,Giá = " + getPrice()+
                " ,dungtich=" + dungtich +
                '}';
    }

    @Override
    public int compareTo(XeMay o) {
        return this.getPrice() - o.getPrice();
    }
}
