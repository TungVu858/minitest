package demo_abtracks;

public abstract class A {
    public abstract void say();
}
interface I{
    public void add();
}
interface Z{
    public void update();
}
class X extends A implements I,Z{

    @Override
    public void say() {
        System.out.println("haha");
    }

    @Override
    public void add() {
        System.out.println("hoho");
    }

    @Override
    public void update() {
        System.out.println("hahaha");
    }
}
class Test{
    public static void main(String[] args) {
        A a = new X();
        a.say();
        I i = new X();
        i.add();
        X x = new X();
        x.say();
        x.add();
        x.update();
    }

}