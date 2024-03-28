class human {
    private int age;
    private String name;

    public String getname() {
        return name;
    }

    public human() { // Default Constructor
        age = 32;
        name = "Damon";
    }

    public human(int age, String name) { // Paramaterised Constructor
        this.age = age;
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int a) {
        age = a;
    }
}

public class constructors {
    public static void main(String[] args) {
        human obj = new human();
        human obj1 = new human(99, "Elena");

        System.out.println(obj.getname() + ":" + obj.getage());
        System.out.println(obj1.getname() + ":" + obj1.getage());
    }
}
