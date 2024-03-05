class mobile {
    String brand;
    int price;
    String name;

    public void show(String[] args) {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class static_variable {
    public static void main(String[] args) {

        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 1800;
        obj1.name = "SmartPhone";

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 1600;
        obj2.name = "SmartPhone";

        obj1.show(args);
        obj2.show(args);

    }
}