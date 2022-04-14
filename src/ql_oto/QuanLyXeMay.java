package ql_oto;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private final XeMay[] danhSach = new XeMay[2];
    private int size = 0;

    @Override
    public void add(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }

    @Override
    public void update(String name, XeMay xeMay) {
        danhSach[find(name)] = xeMay;
    }

    @Override
    public void delete(String name) {
        danhSach[find(name)] = null;
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(danhSach[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("***********");
    }

    @Override
    public void sapXep() {
        Arrays.sort(danhSach);
    }

    public static void main(String[] args) {
        QuanLyXeMay quanLyXeMay = new QuanLyXeMay();
        XeMay xeMay = new XeMay("Honda", "Xanh", "Dream", 300, 50);
        XeMay xeMay1 = new XeMay("Honda", "Đỏ", "Hondacivic", 400, 100);
        quanLyXeMay.add(xeMay);
        quanLyXeMay.add(xeMay1);
        quanLyXeMay.printAll();
//        System.out.println(quanLyXeMay.find("Dream"));
        XeMay xeMay2 = new XeMay("Hoda","Vàng","Airblade",700,120);
        quanLyXeMay.update("Dream",xeMay2);
        quanLyXeMay.printAll();
        quanLyXeMay.sapXep();
        quanLyXeMay.printAll();
        quanLyXeMay.delete("Hondacivic");
        quanLyXeMay.printAll();
    }
}
