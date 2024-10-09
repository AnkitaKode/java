class Refrence {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

    public static void main(String args[]) {
        Refrence op = new Refrence();

        System.out.println("before change " + op.data);
        op.change(500);
        System.out.println("after change " + op.data);

    }
}