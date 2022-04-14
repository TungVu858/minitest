package ql_oto;

public interface QuanLy<T> {
    void add(T t);
    void update(String name,T t);
    void delete(String name);
    int find(String name );
    void printAll();
    void sapXep();
}
