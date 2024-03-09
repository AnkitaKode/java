class mobile {
    String brand;
    int price;
    static String name;

    public mobile() {
        brand = "samsung";
        price = 1900;
        System.out.println("In constructor block");
    }

    static {
        name = "Phone";
        System.out.println("In static Block");
    }

    public void show(String[] args) {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(mobile obj1) {
        System.out.println(obj1.brand + ":" + obj1.price + ":" + obj1.name);
    }
}

public class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("mobile");

        // mobile obj1 = new mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1800;
        // mobile.name="Smartphone";

        // mobile obj2 = new mobile();
    }
}
