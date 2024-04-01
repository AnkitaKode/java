class A extends Object {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super(); // super() method executes the constructor of same class
        System.out.println("in B");
    }

    public B(int n) {
        this(); // this() method executes the constructor of same class
        System.out.println("in B int");
    }
}

public class Super {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
