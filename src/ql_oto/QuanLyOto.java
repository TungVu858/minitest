package ql_oto;

import java.util.Arrays;

public class QuanLyOto implements QuanLy<Oto>{
    private final Oto[] dsOto = new Oto[3];
    private int size = 0;
    @Override
    public void add(Oto oto) {
        dsOto[size] = oto;
        size++;
    }

    @Override
    public void update(String name,Oto oto) {
        dsOto[find(name)] = oto;
    }

    @Override
    public void delete(String name) {
        dsOto[find(name)] = null;
    }

    @Override
    public int find(String name) {
        for (int i =0;i<size;i++){
            if (name.equals(dsOto[i].getName())){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void printAll() {
        for (int i =0;i<size;i++){
            System.out.println(dsOto[i]);
        }
        System.out.println("++++++++++++++++++");
    }

    @Override
    public void sapXep() {
        Arrays.sort(dsOto);
    }

    public static void main(String[] args) {
        QuanLyOto quanLyOto = new QuanLyOto();
        Oto oto = new Oto("Ford","Trắng","Ford200",2000,4);
        Oto oto1 = new Oto("Ford","Đỏ","Ford210",2500,6);
        Oto oto2 = new Oto("Ford","Trắng","Ford20",200,4);
        quanLyOto.add(oto);
        quanLyOto.add(oto1);
        quanLyOto.add(oto2);
        quanLyOto.printAll();
        quanLyOto.sapXep();
        quanLyOto.printAll();
        Oto oto3 = new Oto("abc","vàng","bca",5000,6);
        quanLyOto.update("Ford20",oto3);
        quanLyOto.sapXep();
        quanLyOto.printAll();

    }
}
