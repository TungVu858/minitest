public class A {
    private String x;

    public A() {
    }

    public A(String x) {
        this.x = x;
    }

    public void say() {
        System.out.println("hh");
    }

    public void say(int a) {
        System.out.println("hh " + a);
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String toString(){
        return "a";
    }
}

class B extends A {
    private String y;

    public B(String y, String x) {
        super(x);
        this.y = y;
    }

    public B() {
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void say1() {
        System.out.println("hoho");
    }

    @Override
    public String toString() {
        return "B{" +
                "y='" + y + '\'' +  getX() +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        B b = new B();
        A a = new B("hh","bb");
        b.say();
        b.say(1);
        a.say();
        ((B) a).say1();
        System.out.println(a);
    }
}
