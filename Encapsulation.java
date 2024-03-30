class human {
    private int age = 18;
    private String name = "Ankita";

    public String getname() {
        return name;
    }

    public int getage() {
        return age;
    }

    public void setage(int a) {
        age = a;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        human obj = new human();
        obj.setage(19);

        // obj.age = 11;
        // obj.name = "Ankita";

        System.out.println(obj.getname() + ":" + obj.getage());
    }
}

