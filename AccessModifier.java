class A {
    private int data = 100;

    private void msg() {
        System.out.println("Hello java");
    }
}

public class AccessModifier {
    public static void main(String args[]) {
        A obj = new A();
        System.out.println(obj.data);//Compile Time Error
        obj.msg(); //Compile Time Error
    }
}