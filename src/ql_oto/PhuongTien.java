package ql_oto;

public abstract class PhuongTien {
    private String hang;
    private String color;
    private String name;
    private int price;

    public PhuongTien() {
    }

    public PhuongTien(String hang, String color, String name, int price) {
        this.hang = hang;
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
